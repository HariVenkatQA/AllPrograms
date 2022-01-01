package org.everything;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExFiftyThree {
	
	public static void main(String[] args) throws AWTException {
		
		//configure the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mari\\eclipse-workspace\\AllPrograms\\driver\\chromedriver.exe");
		
		//Object creation
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/stores/page/88D59F86-9161-4804-A524-0A5B39CD714A/?_encoding=UTF8&store_ref=SB_A07317792XER6D27SELMO&pd_rd_plhdr=t&aaxitk=32770b1b044563863d98fd69d1637b44&hsa_cr_id=9712803540902&lp_query=apple&lp_slot=auto-sparkle-hsa-tetris&ref_=sbx_be_s_sparkle_nafd_cta&pd_rd_w=nx0i2&pf_rd_p=47ac07ef-304a-41df-a673-0b368707e6c6&pd_rd_wg=43Qcs&pf_rd_r=2VGA5K0JG4N8XNVGBFS5&pd_rd_r=286d74c7-d967-40ff-a869-1b56957d7f16");
		
		WebElement iphon = driver.findElement(By.xpath("(//span[text()='iPhone'])[1]"));
		
		Actions a = new Actions(driver);
		a.contextClick(iphon).perform();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> allwindowsid = driver.getWindowHandles();
		
		System.out.println(allwindowsid);
		
		List<String> li = new LinkedList<String>();
		
		li.addAll(allwindowsid);
		
		driver.switchTo().window(li.get(1));
		

		
		
		

		
	}

}
