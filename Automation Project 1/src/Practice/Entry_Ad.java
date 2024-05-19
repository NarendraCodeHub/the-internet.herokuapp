package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Entry_Ad {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//Launch the Browser
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the URL 
		driver.get("https://the-internet.herokuapp.com/");
		
		//Click on Entry Ad Link 
		driver.findElement(By.linkText("Entry Ad")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//p[.='Close']")).click();
		
		driver.close();
		
	}
}

