package Mousemovement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\jars\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://triotend.com/ecom/");
		WebElement mainMenu = driver.findElement(By.cssSelector("ul.main-header-menu li:nth-of-type(1)"));
		Actions actions = new Actions(driver);
		actions.moveToElement(mainMenu).build().perform();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS) ;
		WebElement subMenu = driver.findElement(By.cssSelector("ul.sub-menu li:nth-of-type(2)"));
		actions.moveToElement(subMenu);
		actions.click().build().perform();		
	}

}
