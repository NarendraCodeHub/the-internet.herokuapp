package Practice;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Geolocation {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> prefs = new HashMap<>();

        // Automatically allow geolocation permission
        prefs.put("profile.default_content_setting_values.geolocation", 1);
      
        options.setExperimentalOption("prefs", prefs);

        WebDriver driver = new ChromeDriver(options);

  		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the URL 
		driver.get("https://the-internet.herokuapp.com/");
		
		//Click on Frames Link 
		driver.findElement(By.linkText("Geolocation")).click();
		
		driver.findElement(By.xpath("//button[.='Where am I?']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}

