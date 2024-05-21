package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Floating_Menu {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//Launch the Browser
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the URL 
		driver.get("https://the-internet.herokuapp.com/");
		
		//Click on Floating Menu Link 
		driver.findElement(By.linkText("Floating Menu")).click();
	
		WebElement navbar = driver.findElement(By.cssSelector("div[id='menu']"));
	      
		JavascriptExecutor js = (JavascriptExecutor) driver;
   
		// Scroll down the page  
		js.executeScript("window.scrollBy(0, 250)");

	    // Verify if navbar is floating
		if (navbar.getCssValue("absolute").equals("fixed")) {
			System.out.println("Navbar is floating.");
		} else {
			System.out.println("Navbar is not floating.");
		}
		
		//close the Browser
		driver.close();
	}
}

