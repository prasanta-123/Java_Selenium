package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_Iframe  {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		String email = driver.findElement(By.xpath("//p[text()='Admin@gmail.com']")).getText();
		System.out.println(email);
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys(email);
		
		
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		String pwd = driver.findElement(By.xpath("//p[text()='Admin@1234']")).getText();
		System.out.println(pwd);
		driver.switchTo().frame(0);
		driver.findElement(By.id("password")).sendKeys(pwd);
		
		Thread.sleep(2000);
		driver.findElement(By.id("confirm-password")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(5000);
		
		driver.quit();
		
		
		

	}

}
