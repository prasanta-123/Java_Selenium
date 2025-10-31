package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("pant");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@title='Flying Machine Men Mankle Relaxed Tapered Fit High-Rise Light Fade Stretchable Jeans']")).click();
		Thread.sleep(3000);
		
         String price = driver.findElement(By.xpath("//h1[contains(text(),'Men Mank')]/../../../div[2]/div[1]/div[1]/p[1]/span[1]/strong")).getText();
         
         System.out.println(price);
         Thread.sleep(3000);
         driver.quit(); 
       
	}

}
