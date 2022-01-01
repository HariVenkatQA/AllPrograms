package org.everything;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExFiftyOne {
	
	public static void main(String[] args) throws InterruptedException {
		
		//configure the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mari\\eclipse-workspace\\AllPrograms\\driver\\chromedriver.exe");
		
		//Object Instanciation
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("firstname")).sendKeys("HariHaran");
		
		driver.findElement(By.name("lastname")).sendKeys("V");
		
		driver.findElement(By.name("reg_email__")).sendKeys("9962452129");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("RobStark46");
	
		WebElement mont = driver.findElement(By.id("month"));
		
		Select s = new Select(mont);
		
		boolean multiple = s.isMultiple();
		System.out.println("Mulit selector Dropdown "+multiple);
		s.selectByVisibleText("May");
		
		WebElement day = driver.findElement(By.id("day"));
		Select s1 = new Select(day);
		s1.selectByVisibleText("6");
		
		WebElement year = driver.findElement(By.id("year"));
		Select s3 = new Select(year);
		s3.selectByVisibleText("1999");
		
		WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		boolean rad = radio.isSelected();
		System.out.println(rad);
		
		if (!rad) {
			radio.click();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
