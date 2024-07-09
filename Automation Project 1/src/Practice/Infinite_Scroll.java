package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Infinite_Scroll {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//Launch the Browser
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the URL 
		driver.get("https://the-internet.herokuapp.com/");
		
		//Click on Forgot PasswordLink 
		driver.findElement(By.linkText("Infinite Scroll")).click();
		
		Actions act = new Actions(driver);
		
		for (int i = 0; ; i++) {
			act.sendKeys(Keys.PAGE_DOWN).build().perform();    //Page Down
		       
	        Thread.sleep(1000);
		}
        
		//close the Browser
		//driver.close();
	}

}

