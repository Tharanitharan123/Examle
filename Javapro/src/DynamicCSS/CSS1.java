package DynamicCSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS1 {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","E:\\Automation\\jars\\chromedriver\\chromedriver.exe");
    WebDriver d=new ChromeDriver();
    d.get("http://triotend.com/tts/site/login");
    
    d.findElement(By.cssSelector("input#email")).sendKeys("triotend@gmail.com");
    Thread.sleep(1000);
    d.findElement(By.cssSelector("input#email")).clear();
    System.out.println("css ID selector");
    	
    d.findElement(By.cssSelector("input.form-username")).sendKeys("triotend");
    Thread.sleep(1000);
    d.findElement(By.cssSelector("input.form-username")).clear();
    System.out.println("css Class selector");

    d.findElement(By.cssSelector("input[name='username']")).sendKeys("triotend Attribute");
    Thread.sleep(2000);
    d.findElement(By.cssSelector("input[name='username']")).clear();
    System.out.println("css Attribute selector");
    
    d.findElement(By.cssSelector("input.form-username[name='username']")).sendKeys("class and attribute");
    Thread.sleep(2000);
    d.findElement(By.cssSelector("input.form-username[name='username']")).clear();

    d.findElement(By.cssSelector("input[name^='us']")).sendKeys("triotend Starts with");
    Thread.sleep(2000);
    d.findElement(By.cssSelector("input[name^='us']")).clear();
    System.out.println("Starts with (^)");

    d.findElement(By.cssSelector("input[name$='me']")).sendKeys("triotend Ends with ($)");
    Thread.sleep(2000);
    d.findElement(By.cssSelector("input[name$='me']")).clear();
    System.out.println("Ends with ($)"); 
    Thread.sleep(2000);

    d.findElement(By.cssSelector("input[id*='email']")).sendKeys("triotend-contains");
    Thread.sleep(2000);
    d.findElement(By.cssSelector("input[id*='email']")).clear();
    
    
	}

}
