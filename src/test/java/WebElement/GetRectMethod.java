package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		int width = driver.findElement(By.xpath("//i[@aria-label='Instagram']")).getRect().getWidth();
	   int height=driver.findElement(By.xpath("//i[@aria-label='Instagram']")).getRect().getHeight();
	   int xaxis=driver.findElement(By.xpath("//i[@aria-label='Instagram']")).getRect().getX();
	   int yaxis=driver.findElement(By.xpath("//i[@aria-label='Instagram']")).getRect().getY();
	   System.out.println(width);
	   System.out.println(height);
	   System.out.println(xaxis);
	   System.out.println(yaxis);
	   Thread.sleep(3000);
	   driver.close();
	   

	}

}
