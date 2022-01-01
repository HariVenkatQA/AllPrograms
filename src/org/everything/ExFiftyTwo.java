package org.everything;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExFiftyTwo {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		//configure the Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mari\\eclipse-workspace\\AllPrograms\\driver\\chromedriver.exe");
	
		//Object Creation
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement button = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		 
		if (button.isDisplayed() && button.isEnabled()) {
			
			button.click();
		}
		
	
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("firstname")).sendKeys("Harivenkat");
		
		driver.findElement(By.name("lastname")).sendKeys("V");
		
		driver.findElement(By.name("reg_email__")).sendKeys("996245219");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("Harivenkat@46");
		
		WebElement day = driver.findElement(By.id("day"));
		
		Select s = new Select(day);
		
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		s.selectByVisibleText("6");
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select s1 = new Select(month);
		s1.selectByVisibleText("May");
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select s2 = new Select(year);	
		s2.selectByVisibleText("1999");
		
		WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		boolean selected = gender.isSelected();
		System.out.println(selected);
		
		if (!selected) {
			gender.click();
		}
		
		Navigation n = driver.navigate();
		
		driver.navigate().to("https://www.netflix.com/in/title/80002479");
		
		driver.navigate().refresh();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File Detina = new File("C:\\Users\\mari\\eclipse-workspace\\AllPrograms\\peaky\\tryth.png");
		
		FileUtils.copyFile(source, Detina);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
