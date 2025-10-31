package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.findElement(By.id("nav-hamburger-menu")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='hmenu-item'][normalize-space()='Bestsellers']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Books")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='Non-fiction']")).click();
		Thread.sleep(2000);
		
		
		
		
		driver.close();
		
		
	}

}
