package Advance_Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone 17");
		Thread.sleep(2000);
		List<WebElement> allLink = driver.findElements(By.xpath("//li[@class='_3D0G9a']"));
		int count=allLink.size();
		System.out.println(count);
		int a=1;
		for (int i = 0; i < count; i++) {
			System.out.println(a+" - "+ allLink.get(i).getText());
			a++;


			Thread.sleep(30);
			
		}
		
		driver.quit();
		
	}

}
