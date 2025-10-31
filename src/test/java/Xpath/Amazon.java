package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 17 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
	   driver.findElement(By.xpath("(//span[contains(text(),'iPhone 17 Pro 256 GB: 15.93 cm (6.3″) ')])[1]")).click();
		
		

	}

}
