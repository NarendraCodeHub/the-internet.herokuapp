package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AB_Testing {
public static void main(String[] args)  {
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	//Launch the Browser
	WebDriver driver = new FirefoxDriver();
	
	//Maximize the Window
	driver.manage().window().maximize();
	
	//Enter the URL
	driver.get("https://the-internet.herokuapp.com/");
	
	//Click on A/B Testing Link
	driver.findElement(By.xpath("//a[.='A/B Testing']")).click();
	
	//Close the Browser
	driver.quit();
}
}
