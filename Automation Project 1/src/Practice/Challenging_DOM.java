package Practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Challenging_DOM {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//Launch the Browser
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the URL 
		driver.get("https://the-internet.herokuapp.com/");
		
		//Click on Challenging DOM Link 
		driver.findElement(By.linkText("Challenging DOM")).click();
		
		try {
			driver.findElement(By.xpath("//a[@class='button']")).click();
			driver.findElement(By.xpath("//a[@class='button alert']")).click();
			driver.findElement(By.xpath("//a[@class='button success']")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Close the window
		driver.quit();
		
	}
}
