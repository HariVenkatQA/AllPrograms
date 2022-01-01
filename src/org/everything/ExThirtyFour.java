package org.everything;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExThirtyFour {
	
	public static void main(String[] args) throws IOException {
		
		//Configure the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mari\\eclipse-workspace\\AllPrograms\\driver\\chromedriver.exe");
		
		//Object Creation
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/title/70136152");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File souce = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\mari\\eclipse-workspace\\AllPrograms\\peaky\\sparctus.png");
		
		FileUtils.copyFile(souce, destination);
		
		
	}

}
