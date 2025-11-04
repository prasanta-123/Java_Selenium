package Advance_Xpath;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naviagte {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.navigate().to("https://github.com/prasanta-123");
		Thread.sleep(4000);
	  for(int i=1;i<=50;i++) {
		  Thread.sleep(4000);
		  driver.navigate().refresh();
		  
	  }
	  driver.quit();

	}

}
