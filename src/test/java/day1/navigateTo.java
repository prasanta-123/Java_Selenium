package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateTo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().to("file:///D:/html/Webpage.html");
		Thread.sleep(3000);
		driver.findElement(By.id("yt")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.id("fb")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
		

	}

}
