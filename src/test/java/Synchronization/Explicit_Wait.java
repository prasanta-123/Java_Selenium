package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.titleContains("Box"));
		
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Multi Select")));
		
		
		driver.findElement(By.linkText("Multi Select")).click();
		Thread.sleep(1000);
		WebElement element=driver.findElement(By.id("select-multiple-native"));
		Select  s=new Select(element);
		String options=s.getWrappedElement().getText();
		System.out.println(options);
		System.out.println("DONE");
	
		
		driver.quit();
		
	}

}
