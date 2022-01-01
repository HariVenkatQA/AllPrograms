package org.everything;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExThirtyFive {
	
	public static void main(String[] args) {
		
		//configure the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mari\\eclipse-workspace\\AllPrograms\\driver\\chromedriver.exe");
		
		//object creation
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
	}

}
