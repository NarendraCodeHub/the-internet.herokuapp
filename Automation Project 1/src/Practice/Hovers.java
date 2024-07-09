package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Hovers {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//Launch the Browser
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the URL 
		driver.get("https://the-internet.herokuapp.com/");
		
		//Click on Forgot PasswordLink 
		driver.findElement(By.linkText("Hovers")).click();
		
		List<WebElement> users = driver.findElements(By.xpath("//img[@alt='User Avatar']"));
		
		 Actions act = new Actions(driver);
		 
		 for(WebElement user:users) {
			 
			 act.moveToElement(user).perform();
			 
			 Thread.sleep(1000);
		 }
		 
		//close the Browser
		driver.close();
	}
}

