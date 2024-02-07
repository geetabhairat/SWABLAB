package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Productpage {
	WebDriver driver;

	public Productpage(WebDriver driver) {
		this.driver = driver;
	}

	public void Verify_Click_On_filter() {
		driver.findElement(By.xpath("//Select[@class='product_sort_container']")).click();
	}

	public void click_filter_applied_Name_A_to_Z() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='az']")).click();
	}

	public boolean Verify_filter_applied_Name_A_to_Z() throws InterruptedException {
		Thread.sleep(1000);
		return driver.findElement(By.xpath("//option[@value='az']")).isDisplayed();
	}

	public void Verify_menu_option() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
	}

	public void Verify_click_on_menu_option() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("about_sidebar_link")).click();
	}

	public void Verify_click_on_about_option_on_menu() throws InterruptedException {
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.id("react-burger-menu-btn")).click();
	}

	public void Verify_click_on_logout_option_on_menu() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.id("logout_sidebar_link")).click();
	}

	public void Enter_username(String Username) {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(Username);
	}

	public void Enter_passward(String Passward) {
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Passward);
	}

	public void Click_on_login() {
		driver.findElement(By.id("login-button")).click();
	}

	public void Verify_click_on_product() throws InterruptedException {
		Thread.sleep(500);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		// driver.findElement(By.id("reset_sidebar_link")).click();
		driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']")).click();
	}

}