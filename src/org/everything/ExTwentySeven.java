package org.everything;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExTwentySeven {
	
	public static void main(String[] args) {
		
		//configure the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mari\\eclipse-workspace\\AllPrograms\\driver\\chromedriver.exe");
		
		//object creation
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		
		Actions a = new Actions(driver);
		
		WebElement cour = driver.findElement(By.xpath("//a[text()='COURSES']"));
		
		a.moveToElement(cour).perform();
		
		WebElement data = driver.findElement(By.xpath("//span[text()='Data Science Training']"));
		
		a.moveToElement(data).perform();
		
		WebElement cli = driver.findElement(By.xpath("//span[text()='Data Science with Python Training']"));
		cli.click();
	}

}
