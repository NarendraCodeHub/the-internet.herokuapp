package Practice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class File_Upload {
	public static void main(String[] args) throws  Exception {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//Launch the Browser
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the URL 
		driver.get("https://the-internet.herokuapp.com/");
		
		//Click on File Upload Link 
		driver.findElement(By.linkText("File Upload")).click();
		
		File upload_File = new File("./drivers/geckodriver.exe");
		
		WebElement file = driver.findElement(By.xpath("//input[@id='file-upload']"));
		
		file.sendKeys(upload_File.getAbsolutePath());
		
		driver.findElement(By.xpath("//input[@id='file-submit']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h3[.='File Uploaded!']"),"File Uploaded!"));
		
		driver.quit();
	}
}

