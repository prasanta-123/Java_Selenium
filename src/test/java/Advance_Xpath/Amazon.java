package Advance_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ASUS-Vivobook-i5-13420H-Keyboard-X1502VA-BQ835WS/dp/B0DTYHD5D1/ref=sr_1_1_sspa?crid=28MBARL22RCJD&dib=eyJ2IjoiMSJ9.DnO6pEoFLBgw05Q7gTpSfgwQl424DZJChrubdyjW1TfV3b3ny5Dxj5eZfbORM7dsTUfP8s4xMt3YUVT0VZHtpwyleTGdOGJuBYe-vuGMWluJTEfGIVjuWWrB_tZ11TDfASbP80B_nVn9WGxthT5modNaTb-vEf5jmCFsY0VY6jKGNcm5GI27FoHEX4cJcdYDrYeC9Lf0SO65_tQw3vLRDdq_bkJaM4RpQU9lAQwU84E.XKtHujXwBIqizVAnWE27DDWyyYDysu2YIqNT46LwpWE&dib_tag=se&keywords=asus%2Bvivo%2Bbook%2B15&qid=1762063956&sprefix=%2Caps%2C233&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1");
		String price = driver.findElement(By.xpath("//span[@id='productTitle']/ancestor::div[@id='centerCol']/descendant::div[@class='a-section a-spacing-none aok-align-center aok-relative']/child::span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay']")).getText();
		System.out.println(price);
		driver.close();
	}

}
