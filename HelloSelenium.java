//this is for iOS. 

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class HelloSelenium {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 15);

	    driver.get("https://google.com");
		//This part was added in case there appears a window with cookie preferences before the actual Google-page
		//If there doesn't come any such window, the following line can be commented out.
		driver.findElement(By.id("L2AGLb")).click();
		// End of new part
		driver.findElement(By.name("q")).sendKeys("m3s" + Keys.ENTER); 
		// selecting web element by CSS selector "div.g:nth-child(1) > div:nth-child(2) > div:nth-child(1)'- and run it
		// WebElement firstResult = wait.until(presenceOfElementLocated(By.cssSelector("div.g:nth-child(1) > div:nth-child(2) > div:nth-child(1)")));

		// Corrected version
		WebElement firstResult = wait.until(presenceOfElementLocated(By.cssSelector("div.g > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")));
		// System.out.println(firstResult.getAttribute("textContent"));

		//Check if text in the first result contains the string 'software engineering'
		//if( firstResult.getAttribute("textContent").contains("software engineering")) {
		// Corrected line
		if( firstResult.getAttribute("textContent").toLowerCase().contains("software engineering")) {

			System.out.println("The Search result contains 'software engineering' ");
		}
		else{
			System.out.println("The search result does not contain keyword 'software engineering'");
		}
		//You can comment out the above if - else statement and uncomment the below statement to test using assertEquals
		//assertEquals("The return result does not contain the search word",firstResult.getAttribute("textContent").contains("software engineering"));

		driver.get("https://www.oulu.fi/university/"); 
		if(driver.getTitle().contains("University of Oulu"))
		    //Pass
		    System.out.println("Page title contains\"University of Oulu\" ");
		else
		    //Fail
		    System.out.println("Page title doesn't contains \"University of Oulu\" ");
		
		if(driver.getPageSource().contains("Thesis defences")) {
			System.out.println("Yes, text \"Thesis defences\" exists in University of Oulu page");
		}
		else {
			System.out.println("no, text \\\"Thesis defences\\\" does not exist in University of Oulu page\""); 
		}
		//closing the browser 
		driver.close();
	}

}
