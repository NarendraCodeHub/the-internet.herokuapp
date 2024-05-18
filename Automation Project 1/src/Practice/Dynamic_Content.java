package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dynamic_Content {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//Launch the Browser
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the URL 
		driver.get("https://the-internet.herokuapp.com/");
		
		//Click on Dynamic Content Link 
		driver.findElement(By.linkText("Dynamic Content")).click();
		
        // Locate the "click here" link and click it
        WebElement clickHereLink = driver.findElement(By.linkText("click here"));
        clickHereLink.click();
        
        // Wait for the page to reload and the dynamic content to change
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement dynamicContent = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='large-10 columns']")));

        // Store the text of the first paragraph before clicking the link
        String initialText = dynamicContent.getText();
        
        // Click the "click here" link to reload the content
        clickHereLink.click();
        
        // Wait for the page to reload again
        wait.until(ExpectedConditions.stalenessOf(dynamicContent));
        WebElement newDynamicContent = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='large-10 columns']")));
        
        // Store the text of the first paragraph after clicking the link
        String newText = newDynamicContent.getText();
        
        // Validate if the text has changed
        if (!initialText.equals(newText)) {
            System.out.println("Content has changed successfully.");
        } else {
            System.out.println("Content did not change.");
        }

		driver.close();
	}
}
