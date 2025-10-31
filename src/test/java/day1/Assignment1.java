package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Create new account")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("firstname")).sendKeys("prasanta kumar");
	Thread.sleep(2000);
	driver.findElement(By.name("lastname")).sendKeys("mallik");
	Thread.sleep(2000);
	driver.findElement(By.name("reg_email__")).sendKeys("prasantamallik195@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.id("password_step_input")).sendKeys("12345");
	Thread.sleep(3000);
	driver.findElement(By.name("websubmit")).click();
	Thread.sleep(4000);
	driver.navigate().back();
	Thread.sleep(2000);
	
	
	
	
	driver.close();
	

	}

}
