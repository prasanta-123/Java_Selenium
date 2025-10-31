package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/html/Webpage.html");
		Thread.sleep(3000);
		driver.findElement(By.className("link")).click();
		Thread.sleep(3000);
		driver.close();
		

	}

}
