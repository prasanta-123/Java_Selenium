package Advance_Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggest_Youtube {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.name("search_query")).sendKeys("cartoon");
		Thread.sleep(1000);
		List<WebElement> suggest = driver.findElements(By.xpath("//div[@class='ytSuggestionComponentSuggestion ytSuggestionComponentLargerSuggestion ytSuggestionComponentThumbnailSuggestion ytSuggestionComponentRoundedSuggestion ytSuggestionComponentThumbnailPadding']"));
	 	int count = suggest.size();    
	 	System.out.println(count);
	 	int num=1;
	 	for (int i = 0; i < count; i++) {
	 		String display = suggest.get(i).getText();
	 		System.out.println(num+" ) "+display);
	 		num++;
	 		Thread.sleep(100);
	 		
			
		}
	 	driver.quit();
	
	
	}

}
