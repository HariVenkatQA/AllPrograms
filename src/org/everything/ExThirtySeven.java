package org.everything;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExThirtySeven {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		//configure the brwoser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mari\\eclipse-workspace\\AllPrograms\\driver\\chromedriver.exe");
		
		//object Instanciation
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement fricli = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		fricli.click();
		
		WebElement seccli = driver.findElement(By.xpath("//button[contains (text(),'confirm box')]"));
		seccli.click();
		
		Thread.sleep(5000);
		Alert a = driver.switchTo().alert();
				
				a.dismiss();
	}

}
