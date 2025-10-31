package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentUrl {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.youtube.com/");
		String currenturl = driver.getCurrentUrl();
		System.out.println("cuurent url:"+ currenturl);
		Thread.sleep(3000);
		driver.close();
		

	}

}
