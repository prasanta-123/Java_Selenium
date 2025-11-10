 package PRATICE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestion {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("dress");
	    Thread.sleep(1000);
		List<WebElement> sugg = driver.findElements(By.xpath("//li[@class='_3D0G9a']"));
		int count = sugg.size();
		System.out.println(count);
	  int a=1;
		for (int i = 0; i < count; i++) {
		String display = sugg.get(i).getText();
		 System.out.println(a+") "+display);
		 a++;
		 Thread.sleep(40);
			
		}
		
	
		driver.quit();
	}

}
