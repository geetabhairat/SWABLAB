package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

	WebDriver driver;

	
	
	public Homepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		 this.driver=driver;
	}
	//public void Loginpage(WebDriver driver) {
      // this.driver=driver;
       
	//}
	public void Enter_username(String Username){
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(Username);
	}
	public void Enter_passward(String Passward){
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Passward);
	}
	public void Click_on_login(){
		driver.findElement(By.id("login-button")).click();
	}
	

}
