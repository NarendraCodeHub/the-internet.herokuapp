package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Context_Menu {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//Launch the Browser
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the URL 
		driver.get("https://the-internet.herokuapp.com/");
		
		//Click on Context Menu Link 
		driver.findElement(By.linkText("Context Menu")).click();
		
		WebElement element = driver.findElement(By.xpath("//div[@id='hot-spot']"));
		
		 Actions act = new Actions(driver);
		 
		 Thread.sleep(1000);
		 
		 //Perform Move Hover to the Element
		 act.moveToElement(element).perform();
		 
		 //Perform Right Click on Element
		 act.contextClick().perform();
		 
		 Thread.sleep(1000);
		 
		//Switch window to Popup
		Alert popup = driver.switchTo().alert();
		
		//Accept the popup
		popup.accept();
	
		driver.quit();	
	}

}
