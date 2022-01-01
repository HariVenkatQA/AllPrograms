package org.everything;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExThirtySix {
	
	public static void main(String[] args) throws InterruptedException {
		
		//configure the browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mari\\eclipse-workspace\\AllPrograms\\driver\\chromedriver.exe");
		
		//Object Creation
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement third = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		third.click();
		Thread.sleep(5000);
		
		Alert a = driver.switchTo().alert();
		
		a.accept();
		
		
	}

}
