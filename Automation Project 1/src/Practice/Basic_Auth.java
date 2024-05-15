package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Basic_Auth {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//Launch the Browser
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		
		//Enter the URL with Auth Key username / password : admin / admin
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
				
		Thread.sleep(1000);
		
		//Close the Browser
		driver.quit();
	}	        
}
