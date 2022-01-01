package org.everything;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExFourtyEight {
	
	public static void main(String[] args) throws InterruptedException {
		
		//configure the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mari\\eclipse-workspace\\AllPrograms\\driver\\chromedriver.exe");
		
		//Object creation
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(5000);
		
//		WebElement uname = driver.findElement(By.name("username"));
//		uname.sendKeys("hari00");
//		
//		WebElement psswrd = driver.findElement(By.name("password"));
//		psswrd.sendKeys("Hari@46");
		
		WebElement login = driver.findElement(By.xpath("//div[text()='Log In']"));
		
		if (login.isSelected()) {
			System.out.println("We can click ");
		}
		
		else {
			System.out.println("button is disabled please enter credintials");
		}
		

		
		
	}

}
