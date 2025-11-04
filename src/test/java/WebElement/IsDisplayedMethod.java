package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapchat.com/" );
		Thread.sleep(4000);
		boolean value = driver.findElement(By.xpath("//a[@aria-label='SPOTLIGHT']//span[@class='ConsumerNavItem_content__HhYUo']")).isDisplayed();
		if (value) {
			System.out.println("elememt is displayed...");
		} else {
           System.out.println("not displayed..");
		}
		Thread.sleep(3000);
		driver.quit();

	}

}
