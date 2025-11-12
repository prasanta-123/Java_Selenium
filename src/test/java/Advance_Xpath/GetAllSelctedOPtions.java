package Advance_Xpath;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelctedOPtions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
			Thread.sleep(3000);
			WebElement element = driver.findElement(By.id("select-multiple-native"));
			Select s=new Select(element);
			
			Thread.sleep(1000);
			s.selectByContainsVisibleText("Cotton ");
            Thread.sleep(2000);
            s.selectByVisibleText("Mens Casual Premium ...");
            Thread.sleep(1000);
        	s.selectByIndex(0);
        	Thread.sleep(1000);
        	List<WebElement> alloption = s.getAllSelectedOptions();
        	int count = alloption.size();
        	for (int i = 0; i < count; i++) {
        		System.out.println(alloption.get(i).getText());
        		Thread.sleep(200);
				
			}
            
           
			driver.quit();
			
			

	}

}
