package Practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Broken_Images {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//Launch the Browser
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the URL 
		driver.get("https://the-internet.herokuapp.com/");
		
		//Click on Broken Images Link 
		driver.findElement(By.linkText("Broken Images")).click();
		
		// Find all image elements on the page
        List<WebElement> images = driver.findElements(By.tagName("img"));

        // Check each image
        for (WebElement img : images) {
            String imageUrl = img.getAttribute("src");
            System.out.println("Validating image: " + imageUrl);

            // Send HTTP request to check if the image is broken
            try {
                HttpURLConnection connection = (HttpURLConnection) new URL(imageUrl).openConnection();
                connection.setRequestMethod("GET");
                connection.connect();

                int responseCode = connection.getResponseCode();
                if (responseCode != 200) {
                    System.out.println("Broken image: " + imageUrl + " - Response code: " + responseCode);
                } else {
                    System.out.println("Valid image: " + imageUrl + " - Response code: " + responseCode);
                }
            } catch (IOException e) {
                System.out.println("Error checking image: " + imageUrl);
                e.printStackTrace();
            }
        }

				
		Thread.sleep(1000);
		
		//Close the Browser
		driver.quit();

	}

}
