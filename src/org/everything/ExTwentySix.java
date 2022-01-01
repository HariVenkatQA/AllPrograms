package org.everything;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExTwentySix {
	
	public static void main(String[] args) throws InterruptedException {
		
		//configure the browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mari\\eclipse-workspace\\AllPrograms\\driver\\chromedriver.exe");
		
		//object Instanciation
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement create = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		create.click();
		
		Thread.sleep(5000);
		
		WebElement fname = driver.findElement(By.xpath("//input[@placeholder='First name']"));
		fname.sendKeys("Venkat");
	}

}
