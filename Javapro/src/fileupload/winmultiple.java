package fileupload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class winmultiple {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\jars\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		   driver.get("http://treecutting.triotend.com/documents.php");
		   Thread.sleep(4000);
	       WebElement el=driver.findElement(By.xpath("//input[@id='picture']"));
//mouse action to click on upload button 
	      Actions clk=new Actions(driver).click(el);
	      clk.build().perform();
	      Thread.sleep(4000);
	      Runtime.getRuntime().exec("E:\\Automation\\auto\\multiplefileupload.exe"+" "+"E:\\Automation\\SRIGIFTSS.pdf");
	   
	    
//second file to upload
	      Thread.sleep(2000);
	      WebElement el1=driver.findElement(By.xpath("//input[@id='picture4']"));
	    //mouse action to click on upload button 
	    	      Actions clk1=new Actions(driver).click(el1);
	    	      clk1.build().perform();
	    	      Thread.sleep(4000);
	    	      Runtime.getRuntime().exec("E:\\Automation\\auto\\multiplefileupload.exe"+" "+"E:\\Automation\\SRIGIFTSS.pdf");


}
}