package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class JavaScript_Alerts {
	public static void main(String[] args)  {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//Launch the Browser
		WebDriver driver = new FirefoxDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//Enter the URL 
		driver.get("https://the-internet.herokuapp.com/");
		//Click on JavaScript Alerts Link 
		driver.findElement(By.linkText("JavaScript Alerts")).click();
		
		JS_Alert(driver);
		try {
			
			JS_Confirm(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			JS_Prompt(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();		
		
	}
	static void JS_Alert(WebDriver driver) {
		driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
		Alert popup = driver.switchTo().alert();
		popup.accept();
	}
	
	static void JS_Confirm(WebDriver driver) throws InterruptedException {
		WebElement js_confirm_popup = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
		//Accept the popup
		js_confirm_popup.click();
		Alert popup = driver.switchTo().alert();
		Thread.sleep(1000);
		popup.accept();
		
		Thread.sleep(2000);
		
		//cancel the popup 
		js_confirm_popup.click();
		Alert popup_again = driver.switchTo().alert();
		Thread.sleep(1000);
		popup_again.dismiss();	
	}
	
	static void JS_Prompt(WebDriver driver) throws InterruptedException {
		WebElement js_prompt_popup = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
		//Sent Text to the popup
		js_prompt_popup.click();
		Alert popup = driver.switchTo().alert();
		Thread.sleep(1000);
		popup.sendKeys("Accept the popup!!!");
		popup.accept();
		
		Thread.sleep(2000);
		
		//cancel the popup 
		js_prompt_popup.click();
		Alert popup_again = driver.switchTo().alert();
		Thread.sleep(1000);
		popup_again.sendKeys("Don't Accept the popup!!!");
		popup_again.dismiss();	
	}
}

