package Advance_Xpath;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllOPtions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
			Thread.sleep(3000);
			WebElement element = driver.findElement(By.id("select-multiple-native"));
			Select s=new Select(element);
			List<WebElement> alloptions = s.getOptions();
			int count = alloptions.size();
			System.out.println(count);
		for (int i = 0; i < count; i++) {
			String options = alloptions.get(i).getText();
			System.out.println(options);
			Thread.sleep(1000);
			
			
			
		}
	
			
        
          
            
			driver.quit();
		

	}

}
