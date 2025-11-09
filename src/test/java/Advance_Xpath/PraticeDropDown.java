package Advance_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PraticeDropDown {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.facebook.com/");
		   driver.findElement(By.linkText("Create new account")).click();
		   Thread.sleep(2000);
		   WebElement day = driver.findElement(By.id("day"));
		   Select s1=new Select(day);
		   s1.selectByIndex(26);
		   Thread.sleep(1000);
		   WebElement month = driver.findElement(By.id("month"));
		   
		   Select s=new Select(month);
		   s.selectByIndex(2);
		   Thread.sleep(1000);
		   WebElement year = driver.findElement(By.id("year"));
		   Select s2=new Select(year);
		  // s2.selectByIndex(22);
		  // s2.selectByVisibleText("2002");
		   s2.selectByValue("2002");
		   
		   Thread.sleep(3000);
		   driver.quit();
		   

	} 

}
