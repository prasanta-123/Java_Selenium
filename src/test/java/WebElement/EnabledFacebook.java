package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnabledFacebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/" );
		Thread.sleep(4000);
		boolean value=driver.findElement(By.name("login")).isEnabled();
		if (value) {
			System.out.println("elememt is enabled...");
		} else {
           System.out.println("disabled..");
		}
		Thread.sleep(3000);
		driver.quit();


	}

}
