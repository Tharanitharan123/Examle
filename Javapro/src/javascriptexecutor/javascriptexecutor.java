package javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecutor {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\jars\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://erp.triotend.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('user_email').value='tester'");
		WebElement loginButton=driver.findElement(By.id("login_button"));
		js.executeScript("arguments[0].click();", loginButton);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(4000);
		js.executeScript("history.go(0)");
	 	
			String sText =  js.executeScript("return document.documentElement.innerText;").toString();
			System.out.println(sText);
		
			String stitle =  js.executeScript("return document.title;").toString();
			System.out.println(stitle);
		
			String sdomain =  js.executeScript("return document.domain;").toString();
			System.out.println(sdomain);
	
			String surl =  js.executeScript("return document.URL;").toString();
			System.out.println(surl);	
			}
	}

