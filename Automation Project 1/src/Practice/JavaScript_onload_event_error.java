package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class JavaScript_onload_event_error {
	public static void main(String[] args)  {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//Launch the Browser
		WebDriver driver = new FirefoxDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//Enter the URL 
		driver.get("https://the-internet.herokuapp.com/");
		//Click on JavaScript onload event error  Link 
		driver.findElement(By.linkText("JavaScript onload event error")).click();
		
		driver.close();
	}
}

	