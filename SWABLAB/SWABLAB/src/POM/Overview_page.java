package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Overview_page {
	WebDriver driver;
	public Overview_page(WebDriver driver) {
		this.driver=driver;
	}
	public void Click_on_finish() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.id("finish")).click();
	}
	
	}
	


