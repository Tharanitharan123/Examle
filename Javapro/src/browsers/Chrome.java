package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Jars\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

	}

}
