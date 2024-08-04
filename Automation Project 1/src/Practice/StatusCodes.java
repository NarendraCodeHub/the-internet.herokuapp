package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StatusCodes {
	public static void main(String[] args)  {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//Launch the Browser
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the URL 
		driver.get("https://the-internet.herokuapp.com/");
		
		//Click on Status Codes Link 
		driver.findElement(By.linkText("Status Codes")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		
		//For 200 Status Code
		driver.findElement(By.xpath("//a[.='200']")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(.,'This page returned a 200 status code.')]")));				driver.findElement(By.xpath("//a[.='here']")).click();
				
		//For 301 Status Code 
		driver.findElement(By.xpath("//a[.='301']")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(.,'This page returned a 301 status code.')]")));
		driver.findElement(By.xpath("//a[.='here']")).click();
				
		//For 400 Status Code 
		driver.findElement(By.xpath("//a[.='404']")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(.,'This page returned a 404 status code.')]")));
		driver.findElement(By.xpath("//a[.='here']")).click();
				
		//For 500 Status Code 
		driver.findElement(By.xpath("//a[.='500']")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(.,'This page returned a 500 status code.')]")));
		driver.findElement(By.xpath("//a[.='here']")).click();
				
		//Close the Window
		driver.close();
		
 }
}

