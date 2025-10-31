package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	

	public static void main(String[] args) throws InterruptedException  {
		
		
		ChromeDriver driver =new ChromeDriver();
		
		Thread.sleep(3000);
		driver.get("https://www.netflix.com/in/");
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println("Title of Netflix Website:"+title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		Thread.sleep(5000);
		driver.close();
		
		
	
      
      
      
      
      
 
		
	}

}
