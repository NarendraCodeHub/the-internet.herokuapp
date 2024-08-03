package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NotificationMessages {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//Launch the Browser
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the URL 
		driver.get("https://the-internet.herokuapp.com/");
		
		//Click on Notification Messages Link 
		driver.findElement(By.linkText("Notification Messages")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		try {
			
			successfulMessage(wait, driver);
			unsuccessfulMessage(wait, driver);
		} catch (Exception e) {
			e.getMessage();
		}
		
		driver.quit();
	}
	
	static void successfulMessage(WebDriverWait wait, WebDriver driver) {
		WebElement btn_clickHere = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[.='Click here']")));
		String msg = "Action successful";
		for (int i = 0; i < 5; i++) {
			btn_clickHere.click();
			WebElement successful_msg = driver.findElement(By.xpath("//div[contains(.,'Action successful')]"));
			if (wait.until(ExpectedConditions.textToBePresentInElement(successful_msg, msg))) {
				System.out.println(msg);
				break;
			}
		}
	}
	static void unsuccessfulMessage(WebDriverWait wait, WebDriver driver) {
		WebElement btn_clickHere = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[.='Click here']")));
		String msg = "Action unsuccesful, please try again";
		for (int i = 0; i < 10; i++) {
			btn_clickHere.click();
			WebElement unsuccessful_msg = driver.findElement(By.xpath("//div[contains(.,'Action unsuccesful, please try again')]"));
			if (wait.until(ExpectedConditions.textToBePresentInElement(unsuccessful_msg, msg))) {
				System.out.println(msg);
				break;
			}
		}
	}
}

