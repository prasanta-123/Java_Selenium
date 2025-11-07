package Advance_Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mamaearth_AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mamaearth.in/");
		driver.findElement(By.xpath("//p[@class='sc-cJSrbW gcbxv']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("sampoo");
		Thread.sleep(2000);
	    List<WebElement> items = driver.findElements(By.xpath("//div[@class='sc-ugnQR bvqGTJ search-cards']"));
	    int count = items.size();
	   System.out.println("total number of suggested items-"+count);
	   int list=1;
	   for (int i = 0; i <count; i++) {
		   String display = items.get(i).getText();
		   System.out.println( list +"-- "+display);
		   list++;
		  
		
	}
	   Thread.sleep(100);
	   driver.quit();
	}

}
