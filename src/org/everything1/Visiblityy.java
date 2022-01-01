package org.everything1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Visiblityy {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mari\\eclipse-workspace\\AllPrograms\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);	
		WebElement login = driver.findElement(By.xpath("//div[text()='Log In']"));
				
		WebElement button = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
		if (button.isEnabled() && button.isDisplayed()) {
			
			button.click();
			Thread.sleep(3000);
		}
		
		
	}
	

}
