package PRATICE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Dropdown {

	public static void main(String[] args) throws InterruptedException {
    
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.id("day"));
		Select s1=new Select(day);
		int total = s1.getOptions().size();
		for(int i=0;i<total;i++){
			s1.selectByIndex(i);
			Thread.sleep(100);
			
			//Thread.sleep(1000);
			
			
    	WebElement month = driver.findElement(By.id("month"));
			Select s2=new Select(month);
			int total1 = s2.getOptions().size();
			for(int i1=0;i1<total1;i1++) {
				s1.selectByIndex(i1);
				Thread.sleep(100);
				
//				Thread.sleep(1000);
				
	     WebElement year = driver.findElement(By.id("year"));
	     Select s3=new Select(year);
	     int total2=s3.getOptions().size();
				for (int j = 0; j < total2; j++) {
					s3.selectByIndex(i);
					Thread.sleep(10);
					
				}
				
				
		
		
		}
		driver.quit();
		
		

	}

	}
}
