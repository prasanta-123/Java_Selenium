package Mouse_Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.vtiger.com/");
		WebElement element = driver.findElement(By.id("companyDropdown"));
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Contact Us")).click();
		String details = driver.findElement(By.xpath("(//div[@class='text-reset text-decoration-none'])[2]")).getText();
		System.out.println(details);
		driver.quit();  
		
		
		
		

	}

}
