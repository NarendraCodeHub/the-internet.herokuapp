package Practice;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Geolocation {
	public static void main(String[] args)  {
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		HashMap<String, Integer> contentsettings = new HashMap<String, Integer>();
		HashMap<String, Object> profile = new HashMap<String, Object>();
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		contentsettings.put("geolocation", 1);
		profile.put("managed_default_content_settings", contentsettings);
		prefs.put("profile", profile);
		options.setExperimentalOption("prefs", prefs);
		WebDriverManager.chromedriver().setup();
		
		//options.addArguments("disable-notifications");
		 
		//Launch the Browser
		WebDriver driver = new ChromeDriver(options);
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the URL 
		driver.get("https://the-internet.herokuapp.com/");
		
		//Click on Frames Link 
		driver.findElement(By.linkText("Geolocation")).click();
		
		driver.findElement(By.xpath("//button[.='Where am I?']")).click();
		
		driver.quit();
	}
}

