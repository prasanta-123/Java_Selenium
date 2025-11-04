package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		int X_axis = driver.findElement(By.xpath("//i[@aria-label='Instagram']")).getLocation().getX();
	   int  Y_axis=driver.findElement(By.xpath("//i[@aria-label='Instagram']")).getLocation().getY();
	   System.out.println( " X_axis value:"+X_axis);
	   System.out.println( " Y_axis value:"+Y_axis);
	   Thread.sleep(3000);
	   driver.quit();
	   
		

	}

}
