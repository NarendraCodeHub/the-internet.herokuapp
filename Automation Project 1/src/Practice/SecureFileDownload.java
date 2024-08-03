package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecureFileDownload {
	public static void main(String[] args)  throws AWTException {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//Launch the Browser
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the Secure File Download URL 
		driver.get("https://admin:admin@the-internet.herokuapp.com/download_secure");
		
		List<WebElement> downloadLink = driver.findElements(By.xpath("//a"));
		
		Robot bot = new Robot();

		for(int i=1;i<=downloadLink.size()-1; i++) {
			
			downloadLink.get(i).click();
			bot.delay(1000);
		}
		
		driver.close();
	}
}

