package Advance_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSingleSelectList {

	public static void main(String[] args) throws InterruptedException {
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.facebook.com/");
   driver.findElement(By.linkText("Create new account")).click();
   Thread.sleep(2000);
   WebElement element = driver.findElement(By.id("month"));
   
   Select s=new Select(element);
   s.selectByIndex(2);
   Thread.sleep(3000);
   driver.quit();
   
   
   
	}

}
