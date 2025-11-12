package Advance_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		Thread.sleep(5000);
		WebElement country = driver.findElement(By.id("select3"));
		Thread.sleep(3000);
				Select countryOPT = new Select(country);
				boolean p = countryOPT.isMultiple();
				if(p) {
					System.out.println("multi select");
				}else {
					System.out.println("single select");
				}
				
			}
		
		
		
		
		

	}


