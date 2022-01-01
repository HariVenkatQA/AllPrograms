package org.everything;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExFifty {
	
	public static void main(String[] args) throws IOException {
		
		//Configure the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mari\\eclipse-workspace\\AllPrograms\\driver\\chromedriver.exe");
		
		//Object creation
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.id("email")).sendKeys("Hari");
		
		Navigation n = driver.navigate();
		
		driver.navigate().to("https://www.netflix.com/in/");
		
		driver.navigate().refresh();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		//for Reminder
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\mari\\eclipse-workspace\\AllPrograms\\peaky\\netflix.png");
		
		FileUtils.copyFile(source, destination);
		
	}

}
