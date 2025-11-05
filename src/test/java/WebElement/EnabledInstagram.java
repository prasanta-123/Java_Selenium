package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnabledInstagram {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/" );
		Thread.sleep(3000);
	
		boolean value=driver.findElement(By.xpath("//button[@class=' _aswp _aswr _aswu _asw_ _asx2']")).isEnabled();
		if (value==true) {
			System.out.println("elememt is enabled...");
		} else {
           System.out.println("disabled..");
		}
		Thread.sleep(3000);
		driver.quit();

	}

}
