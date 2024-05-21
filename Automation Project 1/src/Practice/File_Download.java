package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class File_Download {
	public static void main(String[] args) throws  Exception {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//Launch the Browser
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the URL 
		driver.get("https://the-internet.herokuapp.com/");
		
		//Click on File Download Link 
		driver.findElement(By.linkText("File Download")).click();
		
		//Find all links 
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		//click on each link one By one
		for(int i=1 ; i<links.size()-1; i++) {
			links.get(i).click();
		}
		
		//Close the Browser
		driver.quit();
		
		
	}
}

