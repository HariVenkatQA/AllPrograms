package org.everything;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExFourtyOne {
	
	
	public static void main(String[] args) throws AWTException {
		
		//configure the browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mari\\eclipse-workspace\\AllPrograms\\driver\\chromedriver.exe");
		
		//Object Creation
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/stores/page/88D59F86-9161-4804-A524-0A5B39CD714A/?_encoding=UTF8&store_ref=SB_A07317792XER6D27SELMO&pd_rd_plhdr=t&aaxitk=32770b1b044563863d98fd69d1637b44&hsa_cr_id=9712803540902&lp_query=Apple&lp_slot=auto-sparkle-hsa-tetris&ref_=sbx_be_s_sparkle_nafd_cta&pd_rd_w=WFGpp&pf_rd_p=47ac07ef-304a-41df-a673-0b368707e6c6&pd_rd_wg=tYqB0&pf_rd_r=FHRFEQSPEAC381J0638E&pd_rd_r=a58227b6-b595-4a2e-aaa5-502006083be5");
		
		
		WebElement iphone = driver.findElement(By.xpath("(//span[text()='iPhone'])[1]"));
		
		Actions a = new Actions(driver);
		a.contextClick(iphone).perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement ipad = driver.findElement(By.xpath("(//span[text()='iPad '])[1]"));
		a.contextClick(ipad).perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement macbook = driver.findElement(By.xpath("(//span[text()='Mac notebooks'])[1]"));
		a.contextClick(macbook).perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		String parentid = driver.getWindowHandle();
		System.out.println(parentid);
		
		Set<String> allwindowsid = driver.getWindowHandles();
		System.out.println(allwindowsid);
		
		int kd = 0;
		
		for (String kj : allwindowsid) {
			kd++;
			
			if (kd==2) {
				driver.switchTo().window(kj);
				break;
				
			}
			
			
			
		}
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
	}

}
