package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dynamic_Loading {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//Launch the Browser
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the URL 
		driver.get("https://the-internet.herokuapp.com/");
		
		//Click on Dynamic Loading Link 
		driver.findElement(By.linkText("Dynamic Loading")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		driver.findElement(By.xpath("//a[.='Example 1: Element on page that is hidden']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[.='Start']"))).click();
		
		WebElement text = driver.findElement(By.xpath("//h4[.='Hello World!']"));
		
		wait.until(ExpectedConditions.textToBePresentInElement(text, "Hello World!"));
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[.='Example 2: Element rendered after the fact']"))).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[.='Start']"))).click();
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h4[.='Hello World!']"), "Hello World!"));
		
		Thread.sleep(1000);
		
		driver.close();
	}
}

