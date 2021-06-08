package dataprovider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Test;

public class exceldateTest {
	WebDriver driver;
	@Beforeclass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\jars\\chromedriver\\chromedriver.exe" );
		driver=new ChromeDriver();
	}
	@Dataprovider
	public Iterator <Object[]> gettestdata() {
		  ArrayList<Object[]> data=login.getdata();
		return data.iterator();
	}
	@Test(dataProvider ="gettestdata")
	  public void logintest(String username, String password) {
		  driver.get("http://triotend.com/tts/site/login");
		  driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		  driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		  driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		  driver.findElement(By.xpath("//header/nav[1]/div[2]/div[1]/div[1]/ul[1]/li[4]/a[1]/img[1]")).click();
		  driver.findElement(By.linkText("Logout")).click();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}	  


}
