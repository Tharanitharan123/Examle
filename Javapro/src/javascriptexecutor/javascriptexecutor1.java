package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecutor1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\jars\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://erp.triotend.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('user_email').value='tester'");
		js.executeScript("document.getElementById('password').value='test'");
		js.executeScript("document.getElementById('login_button').click();");
		Thread.sleep(15000);
		 WebElement el=driver.findElement(By.cssSelector("ul:nth-child(6) li:nth-child(5) ul:nth-child(2) li:nth-child(5) > a:nth-child(1)"));
		 js.executeScript("arguments[0].click();", el);
		 Thread.sleep(12000);
		  
		  js.executeScript("window.location ='http://erp.triotend.com/salesinvoice.php';");
			
					js.executeScript("window.scrollBy(0,300)");
					Thread.sleep(2000);
			
				   WebElement txt=driver.findElement(By.id("amountPaid"));
				   js.executeScript("arguments[0].scrollIntoView(true)",txt);
				   Thread.sleep(7000);
				
				   js.executeScript("window.scrollBy(0,document.body.scrollHeight)");	
	          
				   WebElement hilight=driver.findElement(By.xpath("//h2[contains(text(),'Notes:')]"));
				   js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",hilight);
		}
	}




