package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {

	public static void main(String[] args) throws InterruptedException {
	
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		// FACEBOOK
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("prasantamallik195@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("preasanta");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		
		driver.close();
		
		//INSTAGRAM ....
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("prasantamallik");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("prasanta");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/main[1]/article[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]")).click();
		Thread.sleep(3000);
		
	}

}
