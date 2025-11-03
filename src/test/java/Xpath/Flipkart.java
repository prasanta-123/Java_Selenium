package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("asus vivobook 15");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[text()='ASUS Vivobook 15, with Backlit Keyboard, Intel Core i7 13th Gen 13620H - (16 GB/512 GB SSD/Windows 11 ...']")).click();
	    String price=driver.findElement(By.xpath("//span[contains(text(),'ASUS Vivobook 15')]/../../../../../../div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]")).getText();
	   
		System.out.println(price);
		
		driver.close();
	}

}
