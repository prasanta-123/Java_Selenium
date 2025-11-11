package Advance_Xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
			Thread.sleep(3000);
			WebElement element = driver.findElement(By.id("select-multiple-native"));
			Select s=new Select(element);
			s.selectByIndex(0);
			Thread.sleep(1000);
			s.selectByVisibleText("Mens Casual Premium ...");
			Thread.sleep(1000);
			s.selectByContainsVisibleText("Cotton ");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Add']")).click();
			Thread.sleep(3000);
			driver.quit();
			
			
	

	}

}
