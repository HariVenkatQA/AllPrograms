package org.everything;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExTwentyNine {
	
	public static void main(String[] args) {
		
		//configure the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mari\\eclipse-workspace\\AllPrograms\\driver\\chromedriver.exe");
		
		//object instanciation
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement user = driver.findElement(By.id("email"));
		
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('value','Greens')", user);
		
		
		Object ob = js.executeScript("return arguments[0].getAttribute('value')", user);
		System.out.println(ob);
		
		WebElement butt = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", butt);
				
	}

}
