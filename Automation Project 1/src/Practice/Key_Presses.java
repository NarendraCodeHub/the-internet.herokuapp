package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Key_Presses {
	public static void main(String[] args)  {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//Launch the Browser
		WebDriver driver = new FirefoxDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//Enter the URL 
		driver.get("https://the-internet.herokuapp.com/");
		//Click on Key Presses Link 
		driver.findElement(By.linkText("Key Presses")).click();
		
		Robot btn;
		try {
			btn = new Robot();
			btn.keyPress(KeyEvent.VK_TAB);
			btn.keyRelease(KeyEvent.VK_TAB);
			
			btn.delay(1000);
			
			btn.keyPress(KeyEvent.VK_ENTER);
			btn.keyRelease(KeyEvent.VK_ENTER);
			
			btn.delay(1000);
			
			btn.keyPress(KeyEvent.VK_ESCAPE);
			btn.keyRelease(KeyEvent.VK_ESCAPE);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
}

