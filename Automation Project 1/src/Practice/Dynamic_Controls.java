package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dynamic_Controls {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//Launch the Browser
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the URL 
		driver.get("https://the-internet.herokuapp.com/");
		
		//Click on Dynamic Controls Link 
		driver.findElement(By.linkText("Dynamic Controls")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		driver.findElement(By.xpath("//button[.='Remove']")).click();
		
		//Wait until Add Button isn't Present
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[.='Add']"))).click();
		
		//Wait until Remove Button isn't Present
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[.='Remove']")));
		
		driver.findElement(By.xpath("//button[.='Enable']")).click();
		
		WebElement text_field = driver.findElement(By.xpath("//input[@type='text']"));
		
		wait.until(ExpectedConditions.elementToBeClickable(text_field)).sendKeys("Check");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[.='Disable']"))).click();
		
		Thread.sleep(1000);
		
		//Close the Browser
		driver.quit();
	}

}

