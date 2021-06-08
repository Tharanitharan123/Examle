package project1;

public class Webelements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Jars\\Chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
        d.get("http://triotend.com/tts/site/login");
        
	}

}
