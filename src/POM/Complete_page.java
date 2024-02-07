package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Complete_page {
	WebDriver driver;
	public Complete_page(WebDriver driver) {
		this.driver=driver;
	}
	public void Verify_Thank_you_for_your_order_Message(){
		String Expectedmsg = "Thank you for your order!";
		String Actualmsg = driver.findElement(By.xpath("//h2[@class='complete-header']")).getText();
		Assert.assertEquals(Expectedmsg, Actualmsg);
	}
	
}
