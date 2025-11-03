package Advance_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MamaEarth {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mamaearth.in/product/organic-baby-shampoo-online");
		
		String price=driver.findElement(By.xpath("//h1[text()='Gentle Cleansing Shampoo, 200ml']//ancestor::div[@class='sc-dRFtgE fZjVVt']/descendant::div[@class='sc-bEjcJn cRqmlI']")).getText();
		Thread.sleep(3000);
		System.out.println(price);
		Thread.sleep(2000);
		driver.close();
	}

}
