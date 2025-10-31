package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mamaearth.in/");
		driver.findElement(By.xpath("//div[@class='sc-cpmKsF jJGWTL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("sampoo");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='sc-dxZgTM ivawVE'])[1]")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
