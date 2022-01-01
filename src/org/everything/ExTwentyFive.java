package org.everything;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExTwentyFive {
	
	public static void main(String[] args) {
		
		//configure the browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mari\\eclipse-workspace\\AllPrograms\\driver\\chromedriver.exe");
		
		//Object Instanciation
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("Prince.hari00");
		
		WebElement passwrd = driver.findElement(By.id("pass"));
		passwrd.sendKeys("Harivenkat@46");
		
		WebElement btn = driver.findElement(By.name("login"));
		btn.click();
		
		String c = driver.getTitle();
		System.out.println(c);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
	}

}
