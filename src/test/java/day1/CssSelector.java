package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone 17");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
