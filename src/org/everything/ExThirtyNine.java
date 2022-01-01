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

public class ExThirtyNine {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		//configure the browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mari\\eclipse-workspace\\AllPrograms\\driver\\chromedriver.exe");
		
		//Object Instanciation
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		
		WebElement prompale = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		prompale.click();
		
		WebElement alebtn = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		alebtn.click();
		
		Alert a = driver.switchTo().alert();
		
		a.sendKeys("Parandhaman");
		
		String text = a.getText();
		System.out.println(text);
		
		a.accept();
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source1 = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\mari\\eclipse-workspace\\AllPrograms\\peaky\\paran.png");
		
		FileUtils.copyFile(source1, destination);

		
		//confirm Alert
//		WebElement confirmm = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
//		confirmm.click();
//		
//		WebElement conale = driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
//		conale.click();
//		
//		Alert a = driver.switchTo().alert();
//		a.dismiss();
		
		
		//simple alert
//		WebElement simple = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
//		simple.click();
//		
//		Thread.sleep(5000);
//		
//		Alert a = driver.switchTo().alert();
//		
//		a.accept();
		
		
		
	}

}
