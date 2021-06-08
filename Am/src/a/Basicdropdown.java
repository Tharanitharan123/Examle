package a;

public class Basicdropdown {
	package Dropdown;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	public static void main(String[] args)  throws InterruptedException {
				
				System.setProperty("webdriver.chrome.driver", "E:\\testing\\jars\\chromedriver\\chromedriver.exe");
				WebDriver d=new ChromeDriver();
				    d.get("http://triotend.com/tts/site/login");
				    d.findElement(By.xpath("//input[@id='email']")).sendKeys("triotend@gmail.com");
				    d.findElement(By.xpath("//input[@id='password']")).sendKeys("triotend");
				    d.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
				    Thread.sleep(4000);
				    d.findElement(By.cssSelector("ul.sidebar-menu li:nth-of-type(1)")).click();
				    d.findElement(By.linkText("Add Appointment")).click();
				    d.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
				    WebElement sdrp=d.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[9]/div[1]/select[1]"));
				    Select drp=new Select(sdrp);
				    drp.selectByIndex(2);
				   
				     
		                  
			}

		}


	}

