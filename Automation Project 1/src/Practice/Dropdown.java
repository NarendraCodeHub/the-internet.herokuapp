package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//Launch the Browser
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the URL 
		driver.get("https://the-internet.herokuapp.com/");
		
		//Click on Dropdown Link 
		driver.findElement(By.linkText("Dropdown")).click();
		
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		
		Select dd = new Select(dropdown);
		
		dd.selectByVisibleText("Option 1");
		
		Thread.sleep(1000);
		
		dd.selectByVisibleText("Option 2");
		
		driver.quit();
		
	}

}
