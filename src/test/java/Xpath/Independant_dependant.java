package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Independant_dependant {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("iphone 17 ");
		driver.findElement(By.cssSelector("button[title='Search for Products, Brands and More']")).click();
		String price = driver.findElement(By.xpath("//div[text()='Apple iPhone 17 Pro (Deep Blue, 1 TB)']/../../../div[2]/div[2]/div[1]/div")).getText();
	    System.out.println(price);
		Thread.sleep(3000);
		
		driver.close();
		

	}

}
