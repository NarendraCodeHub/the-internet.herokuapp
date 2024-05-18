package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkboxes {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//Launch the Browser
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the URL 
		driver.get("https://the-internet.herokuapp.com/");
		
		//Click on Checkboxes Link 
		driver.findElement(By.linkText("Checkboxes")).click();
		
		//Find all the chcek box in webpage
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		//Click one by one on Check Box 
		for(WebElement box:checkbox) {
			box.click();
		}
		
		Thread.sleep(1000);
		
		//Close the Browser
		driver.quit();
	}
}
