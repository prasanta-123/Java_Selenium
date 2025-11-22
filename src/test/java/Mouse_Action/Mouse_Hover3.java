package Mouse_Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.myntra.com/");
		WebElement element = driver.findElement(By.linkText("Men"));
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
		driver.findElement(By.linkText("T-Shirts")).click();
		Thread.sleep(4000);
		driver.quit();

		
		
	}

}
