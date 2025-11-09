package PRATICE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAll_Link {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		List<WebElement> allink = driver.findElements(By.xpath("//a"));
		int count = allink.size();
		System.out.println(count);
		int a=1;
		for(int i=0;i < count;i++) {
			String display_link = allink.get(i).getText();
			System.out.println(a+") "+display_link);
			a++;
			Thread.sleep(30);
			
		}
		driver.quit();
		
	}

}
