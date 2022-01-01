package org.everything1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtablee {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mari\\eclipse-workspace\\AllPrograms\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement table = driver.findElement(By.id("customers"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		//To the fetch the rows from the table
		
		for (int i = 0; i < rows.size(); i++) {
			
			WebElement row = rows.get(i);
			
//			List<WebElement> headings = row.findElements(By.tagName("th"));
//			for (int j = 0; j < headings.size(); j++) {
//				WebElement heading = headings.get(j);
//				String text = heading.getText();
//				System.out.println(text);
//			}
			
			List<WebElement> datas = row.findElements(By.tagName("td"));
			for (int j = 0; j < datas.size(); j++) {
				WebElement data = datas.get(j);
				String text = data.getText();
				
				if (text.equals("Germany")) {
					System.out.println("Germany Present");
					System.out.println("RowNumber :"+(i+1));
					System.out.println("ColumnNumber :"+(j+1));
				}
			}
			
		}
		
	}

}
