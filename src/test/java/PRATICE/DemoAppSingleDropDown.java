package PRATICE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoAppSingleDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		Thread.sleep(3000);
		WebElement country = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
		
		Select s=new Select(country);
		s.selectByVisibleText("India");
		Thread.sleep(1000);
		WebElement state = driver.findElement(By.xpath("//label[text()='State']/following-sibling::select"));
		Select s1= new Select(state);
		s1.selectByValue("Odisha");
		Thread.sleep(1000);
		WebElement city = driver.findElement(By.xpath("//label[text()='City']/following-sibling::select"));
		Select s2=new Select(city);
		s2.selectByContainsVisibleText("Balasore");
		Thread.sleep(3000);
		driver.quit();
	}

}
 