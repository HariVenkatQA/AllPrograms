package org.everything;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExFourtyFour {
	
	public static void main(String[] args) {
		
		//configure the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mari\\eclipse-workspace\\AllPrograms\\driver\\chromedriver.exe");
		
		//object craetion
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (int i = 0; i < rows.size(); i++) {
			WebElement row = rows.get(i);
			
			List<WebElement> headings = row.findElements(By.tagName("th"));
			for (int j = 0; j < headings.size() ; j++) {
				WebElement heading = headings.get(j);
				String headingtext = heading.getText();
				System.out.println(headingtext);
				
			}
			
			List<WebElement> datas = row.findElements(By.tagName("td"));
			for (int j = 0; j < datas.size(); j++) {
				WebElement data = datas.get(j);
				String datatext = data.getText();
				System.out.println(datatext);
				
			}
			
			
			
		}
		
	}

}
