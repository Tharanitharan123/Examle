package web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Jars\\Chromedriver\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
    d.get("http://triotend.com/tts/site/login");
    d.findElement(By.id( "email")).sendKeys("trio@gmail.com");
    Thread.sleep(1000);
    d.findElement(By.id("email")).clear();
    Thread.sleep(2000);
    System.out.println("locating based on ID success");
    d.findElement(By.className("form-username")).sendKeys("Triotend");
    d.findElement(By.tagName("a")).click();
    d.findElement(By.partialLinkText("Admin Log")).click();
    d.findElement(By.name("username")).sendKeys("trio@gmail.com");
    Thread.sleep(1000);
    d.findElement(By.name("username")).clear();  
    Thread.sleep(1000);
    d.findElement(By.linkText("Forgot Password?")).click();
    Thread.sleep(2000);
    d.findElement(By.partialLinkText("Admin")).click();
    Thread.sleep(4000);
    d.findElement(By.cssSelector("#email")).sendKeys("trio@gmail.com");
    Thread.sleep(1000);
    d.findElement(By.cssSelector("#email")).clear();  
    Thread.sleep(1000);
    d.findElement(By.xpath("//input[@id='email']")).sendKeys("trio@gmail.com");
    Thread.sleep(1000);
    d.findElement(By.xpath("//input[@id='email']")).clear();  
    Thread.sleep(1000);d.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).sendKeys("trio@gmail.com");
    Thread.sleep(1000);
    d.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).clear();      
    Thread.sleep(1000);

 
	}

}
