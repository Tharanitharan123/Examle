package Dynamicxath;

public class Dynamicxpath {
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "E:\\testing\\jars\\chromedriver\\chromedriver.exe");
			WebDriver d=new ChromeDriver();
		    d.get("http://triotend.com/tts/site/login");
		    
		  
		    d.findElement(By.xpath("//input[@id='email']")).sendKeys("trio@gmail.com");
		    Thread.sleep(1000);
		    d.findElement(By.xpath("//input[@id='email']")).clear();  
		    Thread.sleep(1000);
		    System.out.println("Xpath based on  double slash success");
		    
	    
		    d.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).sendKeys("trio@gmail.com");
		    Thread.sleep(1000);
		    d.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).clear();      
		    Thread.sleep(1000);
		    System.out.println("Xpath based on single slash success");
		       
		
		    d.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("test@gmail.com");
		    Thread.sleep(1000);
		    d.findElement(By.xpath("//input[@placeholder='Username']")).clear();
		    System.out.println("Xpath based on Single Attribute with tag name success");
		    
		    
		  
		    d.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("test@gmail.com");
		    Thread.sleep(1000);
		    d.findElement(By.xpath("//*[@placeholder='Username']")).clear();
		    System.out.println("Xpath based on Single Attribute without tag name success");
		    
		   
		    d.findElement(By.xpath("//input[@placeholder='Username'][@id='email']")).sendKeys("test@gmail.com");
		    Thread.sleep(1000);
		    d.findElement(By.xpath("//input[@placeholder='Username'][@id='email']")).clear();
		    System.out.println("Xpath based on Multiple Attribute with tag name success");
		    
		  
		    d.findElement(By.xpath("//*[@placeholder='Username'][@id='email']")).sendKeys("test@gmail.com");
		    Thread.sleep(1000);
		    d.findElement(By.xpath("//*[@placeholder='Username'][@id='email']")).clear();
		    System.out.println("Xpath based on Multiple Attribute with tag name success");
		    
		    
		  
		    d.findElement(By.xpath("//input[@placeholder='Username' and @id='email']")).sendKeys("test@gmail.com");
		    Thread.sleep(1000);
		    d.findElement(By.xpath("//input[@placeholder='Username'and @id='email']")).clear();
		    System.out.println("Xpath based on AND Multiple Attribute with tag name success");
		    
		 
		    d.findElement(By.xpath("//*[@placeholder='Username'or @id='email']")).sendKeys("test@gmail.com");
		    Thread.sleep(1000);
		    d.findElement(By.xpath("//*[@placeholder='Username'or @id='email']")).clear();
		    System.out.println("Xpath based on AND Multiple Attribute with tag name success");
		    
		
		    d.findElement(By.xpath("//input[@placeholder='Username' or @id='email']")).sendKeys("test@gmail.com");
		    Thread.sleep(1000);
		    d.findElement(By.xpath("//input[@placeholder='Username'or @id='email']")).clear();
		    System.out.println("Xpath based on OR Multiple Attribute with tag name success");
		    
		    
		    d.findElement(By.xpath("//*[@placeholder='Username'or @id='email']")).sendKeys("test@gmail.com");
		    Thread.sleep(1000);
		    d.findElement(By.xpath("//*[@placeholder='Username'or @id='email']")).clear();
		    System.out.println("Xpath based on OR Multiple Attribute with tag name success");
		    
		    d.close();
		}

	}


}
