package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {

	public static void main(String[] args)  throws InterruptedException{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Submit Click']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("sat_a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("btn_abh")).submit();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		

	}

}
