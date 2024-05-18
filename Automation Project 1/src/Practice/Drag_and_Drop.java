package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Drag_and_Drop {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//Launch the Browser
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the URL 
		driver.get("https://the-internet.herokuapp.com/");
		
		//Click on Context Menu Link 
		driver.findElement(By.linkText("Drag and Drop")).click();
				
		WebElement element_A = driver.findElement(By.xpath("//div[@id='column-a']"));
		
		WebElement element_B = driver.findElement(By.xpath("//div[@id='column-b']"));
				
		 Actions act = new Actions(driver);
				 
		 act.dragAndDrop(element_A, element_B).perform();
		 
		 Thread.sleep(2000);
		 
		 act.dragAndDrop(element_B, element_A).perform();
		 
		 Thread.sleep(2000);
		
		driver.close();
	}
}
