package org.everything1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertt {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chroe.driver", "C:\\Users\\mari\\eclipse-workspace\\AllPrograms\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
	}

}
