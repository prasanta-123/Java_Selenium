package Mouse_Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/button/buttonDouble?sublist=2");
		
		WebElement element = driver.findElement(By.id("btn_a"));
		Actions a=new Actions(driver);
		a.doubleClick(element).perform();
		String text = driver.findElement(By.xpath("//span[@class='text-green-600 p-1 px-2 ms-2 rounded-md']")).getText();
		System.out.println(text);
		Thread.sleep(3000);
		driver.quit();
		
				
		
	}

}
