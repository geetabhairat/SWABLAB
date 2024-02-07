package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Your_information_page {
	WebDriver driver;

	public Your_information_page(WebDriver driver) {
		this.driver = driver;
	}

	public void enter_first_name_last_name_zip_code_and_click_on_continue() throws InterruptedException {
		Thread.sleep(500);
		driver.findElement(By.id("first-name")).sendKeys("geytf");
		driver.findElement(By.id("last-name")).sendKeys("hgsfg");
		driver.findElement(By.id("postal-code")).sendKeys("1435321");

		driver.findElement(By.id("continue")).click();
	}

}
