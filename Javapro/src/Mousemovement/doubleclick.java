package Mousemovement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\jars\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://triotend.com/ecom/");	
		Actions action = new Actions(driver);
		WebElement ele = driver.findElement(By.cssSelector("div.astra-shop-thumbnail-wrap >span.onsale"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ele);
	action.doubleClick(ele).build().perform();
	}

}
