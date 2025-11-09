package Advance_Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_AutoSugg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
		Thread.sleep(1000);
		List<WebElement> sugg = driver.findElements(By.xpath("//div[@role='row']"));
		int count = sugg.size();
		System.out.println(count);
		int a=1;
		for (int i = 0; i < count; i++) {
			String display = sugg.get(i).getText();
			System.out.println(a+") "+display);
			a++;
			Thread.sleep(50);
			
			
			
		}
		driver.quit();
		

	}

}
