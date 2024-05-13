package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AB_Testing {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	//Enter the URL
	driver.get("https://the-internet.herokuapp.com/");
	driver.findElement(By.xpath("//a[.='A/B Testing']")).click();
	Thread.sleep(2000);
	driver.close();
}
}
