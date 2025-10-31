package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class idLocotrs {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/html/Webpage.html");
		Thread.sleep(3000);
		 WebElement adress = driver.findElement(By.id("fb"));
		 adress.click();
		 Thread.sleep(3000);
		 driver.close();
		

	}

}
