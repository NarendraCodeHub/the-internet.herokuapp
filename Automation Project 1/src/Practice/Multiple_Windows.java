package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_Windows {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//Launch the Browser
		WebDriver driver = new FirefoxDriver();
				
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the URL 
		driver.get("https://the-internet.herokuapp.com/");
		
		//Click on  Multiple Windows Menus Link 
		driver.findElement(By.linkText("Multiple Windows")).click();
		
		String parent=driver.getWindowHandle();
		
		WebElement click_here = driver.findElement(By.xpath("//a[.='Click Here']"));
		
		click_here.click();
		
		Thread.sleep(1000);
		
		Set<String> windows = driver.getWindowHandles();
		
		// Now iterate using Iterator
		Iterator<String> I1= windows.iterator();
		while(I1.hasNext()) {
			String child_window=I1.next();
			if(!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				System.out.println(driver.switchTo().window(child_window).getTitle());
			}
		}
		driver.close();
		
		Thread.sleep(1000);
		
		driver.switchTo().window(parent);
		
		driver.quit();
	}
}

