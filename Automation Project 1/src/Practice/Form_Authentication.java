package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Form_Authentication {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//Launch the Browser
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the URL 
		driver.get("https://the-internet.herokuapp.com/");
		
		//Click on Form Authentication Link 
		driver.findElement(By.linkText("Form Authentication")).click();
		
		String username = "tomsmith";
		String password = "SuperSecretPassword!";
		
		driver.findElement(By.id("username")).sendKeys(username);
		
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//i[.=' Logout']")).click();
		
		driver.close();
	}
}

