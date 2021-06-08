package DynamicCSS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\jars\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
	    d.get("http://triotend.com/tts/site/login");
	    
	    d.findElement(By.xpath("//input[@id='email']")).sendKeys("triotend@gmail.com");
	    d.findElement(By.xpath("//input[@id='password']")).sendKeys("triotend");
	    d.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
	    Thread.sleep(4000);
 
	    d.findElement(By.cssSelector("ul.sidebar-menu>li")).click();
	    Thread.sleep(4000);

	    d.findElement(By.cssSelector("ul.sidebar-menu li:nth-of-type(10)")).click();
	    Thread.sleep(4000);
	    d.findElement(By.cssSelector("ul.sidebar-menu.verttop > li.treeview.active >ul> li:nth-child(2) > a")).click();
	    Thread.sleep(4000);

	    d.findElement(By.cssSelector("ul.sidebar-menu li:nth-of-type(2)")).click();
}
}