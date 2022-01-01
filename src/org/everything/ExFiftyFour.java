package org.everything;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExFiftyFour {
	
	public static void main(String[] args) {
		
		//Configure the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mari\\eclipse-workspace\\AllPrograms\\driver\\chromedriver.exe");
		
		//Object creation
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement cre = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		cre.click();
		//implicit waits
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("Aryastark");
	
		
		//Explicit waits
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("login"))));
		w.until(ExpectedConditions.alertIsPresent());
		
		w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("(//iframe)[1])"));
		
		FluentWait<WebDriver> f = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(10)).ignoring(Exception.class);
		
		
		
	}

}
