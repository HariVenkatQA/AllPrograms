package org.everything;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExThirtyThree {
	
	public static void main(String[] args) throws IOException {
		
		//configure the browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mari\\eclipse-workspace\\AllPrograms\\driver\\chromedriver.exe");
		
		//object Creation
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/title/80002479");
		
		//syntax for screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		//screenshot will be taken and it will stored in a temp folder
		File source = ts.getScreenshotAs(OutputType.FILE);
	
		//create a destination Folder
		//File file = new File("Folderpath\\filename.fileextension");
		File destination = new File("C:\\Users\\mari\\eclipse-workspace\\AllPrograms\\peaky\\ss.png");
		
		FileUtils.copyFile(source, destination);
		
//		WebElement pb = driver.findElement(By.xpath("//h1[text()='Peaky Blinders']"));
		
		
		
	}

}
