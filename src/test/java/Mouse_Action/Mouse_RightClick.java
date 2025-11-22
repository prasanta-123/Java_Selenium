package Mouse_Action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_RightClick {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		WebElement element = driver.findElement(By.linkText("Forgotten password?"));
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.contextClick(element).perform();
		Thread.sleep(2000);
		Robot r=new Robot();
		//r.keyPress(KeyEvent.VK_T);//for new tab...
		r.keyPress(KeyEvent.VK_W);//for new Window..
		Thread.sleep(4000);
		driver.quit();
		
		

	}

}
