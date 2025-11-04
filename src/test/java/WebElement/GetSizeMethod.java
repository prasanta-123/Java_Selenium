package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		int width = driver.findElement(By.xpath("//i[@aria-label='Instagram']")).getSize().getWidth();
	   int height=driver.findElement(By.xpath("//i[@aria-label='Instagram']")).getSize().getHeight();
	   System.out.println(width);
	   System.out.println(height);
	   Thread.sleep(3000);
	   driver.close();
	   
		

	}

}
