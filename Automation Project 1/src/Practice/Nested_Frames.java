package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Nested_Frames {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//Launch the Browser
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the URL 
		driver.get("https://the-internet.herokuapp.com/");
		
		//Click on Nested Frames Link 
		driver.findElement(By.linkText("Nested Frames")).click();
		
		try {
			leftFrame(driver);
			middleFrame(driver);
			rightFrame(driver);
			bottomFrame(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	driver.close();
	}
	
	static void leftFrame(WebDriver driver ) throws InterruptedException {
		//Switch to left Frame
		WebElement frameLeft = driver.findElement(By.xpath("(//frame)[1]"));
		driver.switchTo().frame(frameLeft);
		driver.switchTo().defaultContent();
	}
	
	static void middleFrame(WebDriver driver ) {
		//Switch to Middle Frame
		WebElement frameMiddle = driver.findElement(By.xpath("(//frame)[2]"));
		driver.switchTo().frame(frameMiddle);
		driver.switchTo().parentFrame();
	}
	
	static void rightFrame(WebDriver driver ) {
		//Switch to Right Frame
		WebElement frameRight = driver.findElement(By.xpath("//frame[@src='/frame_right and @name='frame-right']"));
		driver.switchTo().frame(frameRight);
		driver.switchTo().parentFrame();
	}
	
	static void bottomFrame(WebDriver driver ) {
		//Switch to Right Frame
		WebElement frameBottom = driver.findElement(By.xpath("//frame[@src='/frame_bottom']"));
		driver.switchTo().frame(frameBottom);
		driver.switchTo().defaultContent();
	}
}

