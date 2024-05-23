package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Forgot_Password {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//Launch the Browser
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the URL 
		driver.get("https://the-internet.herokuapp.com/");
		
		//Click on Forgot PasswordLink 
		driver.findElement(By.linkText("Forgot Password")).click();
		
		String value = "test@gmail.com";
		
		 WebElement email_field = driver.findElement(By.id("email"));
		 
		 email_field.sendKeys(value);
		
		driver.findElement(By.xpath("//i[.='Retrieve password']")).click();
		
		//close the Browser
		driver.close();
	}
}

