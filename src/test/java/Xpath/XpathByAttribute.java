package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("search_query")).sendKeys("songs");
	    driver.findElement(By.xpath("//button[@title='Search']")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath(" //yt-formatted-string[@aria-label='For A Reason (Official Video) Karan Aujla | Tania  | Ikky | Latest Punjabi Songs 2025 3 minutes, 9 seconds']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@aria-label='Full screen keyboard shortcut f']")).click();
	    Thread.sleep(5000);
		driver.close();
	}

}
