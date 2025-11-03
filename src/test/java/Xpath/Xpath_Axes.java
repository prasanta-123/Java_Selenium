package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Axes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone 17");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[text()='Apple iPhone 17 (Black, 256 GB)']")).click();
		Thread.sleep(2000);
		
		String price = driver.findElement(By.xpath("//span[text()='Apple iPhone 17 (Black, 256 GB)']/ancestor::div[@class='DOjaWF YJG4Cf']/descendant::div[@class='Nx9bqj CxhGGd']")).getText();
		
		System.out.println(price);
		Thread.sleep(3000);
		driver.close();
		
	
		
		

	}

}

