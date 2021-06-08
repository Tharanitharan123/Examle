package tooltip;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bootstrptooltip {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\Automation\\jars\\chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/bootstrap/bootstrap_tooltip.asp");
	WebElement cart=driver.findElement(By.xpath("//button[contains(text(),'Hover over me')]"));
	Actions action=new Actions(driver);
	driver.manage() .timeouts() .implicitlyWait(4,TimeUnit.SECONDS);
	action.moveToElement(cart).build() .perform();
	String tooltip_msg=driver.findElement(By.className("tooltip")).getText();
	System.out.println("tooltip_msg");

	}

}