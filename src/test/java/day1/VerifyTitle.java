package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		String expectedTitle = "Instagram";
		String actualTitle = driver.getTitle();
		
		if (expectedTitle.equalsIgnoreCase(actualTitle)) {
			System.out.println("title is matching");
			
		} else {
			System.out.println("title is not matching");

		}
		Thread.sleep(3000);
		driver.close();

	}

}
