package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Product_details_page {

	WebDriver driver;

	public Product_details_page(WebDriver driver) {
		this.driver = driver;
	}
	
	public void Verify_click_on_add_to_cart() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
	}
	public void Verify_click_on_remove_option() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt")).click();
	}
	public void click_on_back_to_product(){
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
	}
	public void click_on_add_to_cart_icon() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	}

}
