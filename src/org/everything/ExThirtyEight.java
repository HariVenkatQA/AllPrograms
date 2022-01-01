package org.everything;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExThirtyEight {
	
	public static void main(String[] args) throws IOException {
		
		//Configure the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mari\\eclipse-workspace\\AllPrograms\\driver\\chromedriver.exe");
		
		//Object Instanciation
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement thicli = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		thicli.click();
		
		WebElement ale = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		ale.click();
		
		Alert a = driver.switchTo().alert();
		a.sendKeys("HariHaran");
		
		String text = a.getText();
		System.out.println(text);
		
		a.accept();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		//this is temp file where ss is saved
		File aler = ts.getScreenshotAs(OutputType.FILE);
		
		File Source = new File ("C:\\Users\\mari\\eclipse-workspace\\AllPrograms\\peaky\\ale.png");
		
		FileUtils.copyFile(aler, Source);
		
		
	}

}
