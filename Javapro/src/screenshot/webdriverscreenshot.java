package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class webdriverscreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\jars\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://triotend.com/ecom/my-account-2/");
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		

		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("E:\\Automation\\"+System.currentTimeMillis()+".png");
		FileHandler.copy(scrFile,destination);


	}

}
