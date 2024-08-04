package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SlowResources {
public static void main(String[] args)  {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//Launch the Browser
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the URL 
		driver.get("https://the-internet.herokuapp.com/");
		
		//Click on Slow Resources Link 
		driver.findElement(By.linkText("Slow Resources")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		//Wait until Element isn't visible
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[.='Slow Resources']")));
		
		//Close the Window
		driver.close();
		
 }
}

