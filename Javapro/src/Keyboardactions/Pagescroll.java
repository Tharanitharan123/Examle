package Keyboardactions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pagescroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\jars\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://triotend.com/");
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		action.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.PAGE_UP).build().perform();
			
	}

}
