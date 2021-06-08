package Mousemovement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\jars\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();
        Actions action = new Actions(driver);
        WebElement rightClickElement=driver.findElement(By.cssSelector(".context-menu-one"));
        action.contextClick(rightClickElement).build().perform();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        WebElement getCopyText =driver.findElement(By.cssSelector(".context-menu-icon-copy"));
        String GetText = getCopyText.getText();
        System.out.println(GetText);
        driver.close();

	}

}
