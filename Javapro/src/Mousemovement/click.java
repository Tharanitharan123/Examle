package Mousemovement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class click {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\jars\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://treecutting.triotend.com/documents.php");
		WebElement e1=driver.findElement(By.xpath("//input[@id='picture']"));
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		action.click(e1).build().perform();
	
	}

}
