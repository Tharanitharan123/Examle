package Errormessagecapturing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class errormessage {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\jars\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://triotend.com/tts/site/login");
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		String username_error=driver.findElement(By.xpath("//p[contains(text(),'Username field is required')]")).getAttribute("innerHTML");
		System.out.println(username_error);
		String password_error=driver.findElement(By.xpath("//p[contains(text(),'Password field is required')]")).getText();
		System.out.println(password_error);
}
}