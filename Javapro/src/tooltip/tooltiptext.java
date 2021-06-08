package tooltip;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tooltiptext {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\jars\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://triotend.com/ecom/");
		WebElement cart=driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/a[1]/div[1]/span[1]"));
		 Actions action=new Actions(driver);
		 driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		 action.moveToElement(cart).build().perform();
		 String tooltip_msg=driver.findElement(By.xpath("//p[contains(text(),'No products in the cart.')]")).getText();
		System.out.println(tooltip_msg);

	}

}
