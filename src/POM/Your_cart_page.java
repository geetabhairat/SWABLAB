package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Your_cart_page {
	WebDriver driver;
	public Your_cart_page(WebDriver driver) {
		this.driver=driver;
	}


	
	public void click_on_checkout_button() throws InterruptedException{
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[text()='Checkout']")).click();
	}

}



