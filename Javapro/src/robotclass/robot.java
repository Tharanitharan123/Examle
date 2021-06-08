package robotclass;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class robot {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\testing\\jars\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://www.facebook.com");
		  driver.findElement(By.id("email")).sendKeys("Selenium@gmail");
		  driver.findElement(By.id("pass")).sendKeys("gg");
		  Robot r=new Robot();
		  r.keyPress(KeyEvent.VK_ENTER);
		   r.keyRelease(KeyEvent.VK_ENTER);
		   Thread.sleep(8000);
		   BufferedImage image=new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		   ImageIO.write(image, "png", new File("E:\\testing\\screenshot\\fberror.png"));
	}
}
