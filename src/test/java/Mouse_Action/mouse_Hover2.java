package Mouse_Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_Hover2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		WebElement element = driver.findElement(By.xpath("//span[text()='Fashion']"));
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
		driver.findElement(By.xpath("//a[text()='Men Footwear']")).click();
		Thread.sleep(3000);
		driver.quit();
		
		
		

	}

}
