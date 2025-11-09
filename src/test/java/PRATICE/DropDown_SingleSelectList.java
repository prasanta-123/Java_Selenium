package PRATICE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_SingleSelectList {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		Thread.sleep(3000);
		WebElement country = driver.findElement(By.id("select3"));
		
		
		Select s1=new Select(country);
		int total=s1.getOptions().size();
		for (int i = 0; i <total; i++) {
			s1.selectByIndex(i);
		Thread.sleep(2000);
		
		}
		driver.quit();
		

	}

}
