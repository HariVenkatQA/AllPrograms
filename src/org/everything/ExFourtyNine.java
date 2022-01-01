package org.everything;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExFourtyNine {
	
	public static void main(String[] args) throws InterruptedException {
		
		//configure the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mari\\eclipse-workspace\\AllPrograms\\driver\\chromedriver.exe");
		
		//Object creation
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement create = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
		//visiblity check method
		
		if (create.isDisplayed() && create.isEnabled()) {
			
			create.click();
			Thread.sleep(5000);
		}
		
		WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		boolean radi = radio.isSelected();
		if (!radi) {
			radio.click();
		}
		
		System.out.println(radio.isSelected());
	}

}
