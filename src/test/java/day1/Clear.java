 package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("prasanta@123.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("prasanta@195.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("23453");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("prasanta");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
	    Thread.sleep(3000);
	    driver.close();
		
		

	}

}
