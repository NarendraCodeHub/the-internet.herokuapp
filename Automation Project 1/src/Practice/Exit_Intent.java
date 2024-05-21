package Practice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Exit_Intent {
	public static void main(String[] args) throws  Exception {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//Launch the Browser
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the URL 
		driver.get("https://the-internet.herokuapp.com/");
		
		//Click on Exit Intent Link 
		driver.findElement(By.linkText("Exit Intent")).click();
		
        // Locate an element within the viewport to move the mouse out from
        WebElement element = driver.findElement(By.xpath("//div[@id='flash-messages']"));
                 
        // Use Actions class to move the mouse out of the viewport
        Actions act = new Actions(driver);
        
        int x = 650; // Example x-coordinate
        int y = 85;  // Example y-coordinate
        
       //act.(x, y).perform();
  	
   
        
     
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//p[.='Close']")).click();
            
        // Close the WebDriver
        driver.quit();
	}
}

