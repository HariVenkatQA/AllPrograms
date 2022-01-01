package org.everything;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExThirty {
	
	public static void main(String[] args) throws InterruptedException {
		
		//configure the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mari\\eclipse-workspace\\AllPrograms\\driver\\chromedriver.exe");
		
		//Object Creation
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/");
		
		WebElement scoldo = driver.findElement(By.xpath("//span[text()='Help Centre']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", scoldo);
		
		Thread.sleep(5000);
		
		WebElement scoup = driver.findElement(By.xpath("//h1[text()='Unlimited movies, TV shows and more.']"));
		
		js.executeScript("arguments[0].scrollIntoView(false)", scoup);
		
		
		
		
	}

}
