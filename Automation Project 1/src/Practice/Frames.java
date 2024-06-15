package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {
	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//Launch the Browser
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the URL 
		driver.get("https://the-internet.herokuapp.com/");
		
		//Click on Frames Link 
		driver.findElement(By.linkText("Frames")).click();
		
		driver.findElement(By.linkText("iFrame")).click();
		
		driver.findElement(By.xpath("//button[@class='tox-notification__dismiss tox-button tox-button--naked tox-button--icon']")).click();
		
		driver.close();
	}
}

