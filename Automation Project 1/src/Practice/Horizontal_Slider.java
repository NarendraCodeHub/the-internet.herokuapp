package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Horizontal_Slider {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//Launch the Browser
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the URL 
		driver.get("https://the-internet.herokuapp.com/");
		
		//Click on Forgot PasswordLink 
		driver.findElement(By.linkText("Horizontal Slider")).click();
		
	    WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));

	    for (int i = 1; i <=10 ; i++) {
	    	Thread.sleep(1000);
	            slider.sendKeys(Keys.ARROW_RIGHT);
	        }

		
		//close the Browser
		driver.close();
	}
}

