 package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentPageSource {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.youtube.com/");
		  String source=driver.getPageSource();
		  System.out.println(source);
		  Thread.sleep(3000);
		  
		  driver.close();

	}

}
