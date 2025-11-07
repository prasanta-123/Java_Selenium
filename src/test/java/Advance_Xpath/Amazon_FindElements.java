package Advance_Xpath;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_FindElements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement> Links = driver.findElements(By.xpath("//a"));
		int count= Links.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			System.out.println(Links.get(i).getText());
			Thread.sleep(100);
			
		}
	
		driver.quit();
		
	}

}
