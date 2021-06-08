package Mousemovement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\jars\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions action = new Actions(driver);
		driver.get("http://jqueryui.com/droppable/");
        WebElement frm=driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frm);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement sourceLocator = driver.findElement(By.cssSelector("#draggable"));
        WebElement targetLocator = driver.findElement(By.cssSelector("#droppable"));
        action.dragAndDrop(sourceLocator, targetLocator).build().perform();
	}
}
