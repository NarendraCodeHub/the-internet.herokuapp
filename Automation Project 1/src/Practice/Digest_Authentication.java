package Practice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Digest_Authentication {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//Launch the Browser
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the URL  Digest Authentication with Auth admin:admin
		driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
		
		driver.close();
	}
}
