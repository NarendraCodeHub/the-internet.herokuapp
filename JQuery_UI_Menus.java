package Practice;

import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class JQuery_UI_Menus {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//Launch the Browser
		WebDriver driver = new FirefoxDriver();
				
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the URL 
		driver.get("https://the-internet.herokuapp.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		//Click on  JQuery UI Menus Link 
		driver.findElement(By.linkText("JQuery UI Menus")).click();
		
		script_Disabled(driver);
		
		script_Enabled(driver);
		
		driver.quit();		
	}
	
	public static void script_Disabled(WebDriver driver) {
		//Scenarios 1: Check for Disabled Element 
		WebElement disabled_element = driver.findElement(By.xpath("//a[.='Disabled']"));
				
		if (disabled_element.isSelected()) {
			System.out.println("Located Element is Selected");
		}else {
			System.out.println("Located Element is Disabled");
		}
	}
	
	public static void script_Enabled(WebDriver driver) throws InterruptedException {
		//Scenarios 2: Check for the Enabled Element
		
		WebElement enabled_element = driver.findElement(By.xpath("//a[.='Enabled']"));
				
		if (enabled_element.isEnabled()) {
			System.out.println("Located Element is Enabled");
		}else {
			System.out.println("Located Element is Disabled");
		}
		
		Download_script(driver);
		
		back_to_Jquery(driver);
		
	}
	
	static void Download_script(WebDriver driver) throws InterruptedException {
		//Download Script -> All Files download
		WebElement enabled_element = driver.findElement(By.xpath("//a[.='Enabled']"));
		
		String parent_window = driver.getWindowHandle();
		
		Actions act = new Actions(driver);
		
		act.moveToElement(enabled_element).perform();
		
		Thread.sleep(1000);
		
		WebElement downloads = driver.findElement(By.xpath("//a[.='Downloads']"));
		
		act.moveToElement(downloads).perform();
		
		//Download PDF File
		WebElement PDF = driver.findElement(By.xpath("//a[.='PDF']"));
		
		Thread.sleep(1000);
		
		act.moveToElement(PDF).perform();
		
		PDF.click();
		
		driver.switchTo().window(parent_window);
		
		//Download CSV File
		
		act.moveToElement(enabled_element).perform();
		
		Thread.sleep(1000);
		
		act.moveToElement(downloads).perform();
		
		WebElement CSV = driver.findElement(By.xpath("//a[.='CSV']"));
		
		Thread.sleep(1000);
		
		act.moveToElement(CSV).perform();
		
		CSV.click();
		
		//Download Excel File
		
		driver.switchTo().window(parent_window);
		
		act.moveToElement(enabled_element).perform();
		
		Thread.sleep(1000);
		
		act.moveToElement(downloads).perform();
		
		WebElement Excel = driver.findElement(By.xpath("//a[.='Excel']"));
		
		Thread.sleep(1000);
		
		act.moveToElement(Excel).perform();
		
		Excel.click();
		}
	
	public static void back_to_Jquery(WebDriver driver) throws InterruptedException {
		
		WebElement enabled_element = driver.findElement(By.xpath("//a[.='Enabled']"));
		Actions act = new Actions(driver);
		
		act.moveToElement(enabled_element).perform();
		
		Thread.sleep(1000);
		
		WebElement back_Jquery = driver.findElement(By.xpath("//a[.='Back to JQuery UI']"));
		
		act.moveToElement(back_Jquery).perform();
		
		back_Jquery.click();
		
		Thread.sleep(2000);
	}
}

