package G;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM.Applicationbasepage;
import POM.Complete_page;
import POM.Homepage;
import POM.Overview_page;
import POM.Product_details_page;
import POM.Productpage;
import POM.Your_cart_page;
import POM.Your_information_page;

public class test extends Applicationbasepage {
	
	@Test(testName = "navigate_to_loginpage", priority = 1)
	public void navigate_to_loginpage() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		homepage = new Homepage(driver);
		productpage = new Productpage(driver);
		product_details_page = new Product_details_page(driver);
		your_cart_page= new Your_cart_page(driver);
		your_information_page =new Your_information_page(driver);
		
		overview_page =new Overview_page(driver);
		complete_page =new Complete_page(driver);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		homepage.Enter_username("standard_user");
		homepage.Enter_passward("secret_sauce");
		homepage.Click_on_login();
		Thread.sleep(3000);
	}

	@Test(testName = "navigate_to_productpage", priority = 2)
	public void Verify_product_page() throws InterruptedException {
		productpage.click_filter_applied_Name_A_to_Z();
		Assert.assertTrue(productpage.Verify_filter_applied_Name_A_to_Z());
		productpage.click_filter_applied_Name_A_to_Z();
		productpage.Verify_menu_option();
		productpage.Verify_click_on_menu_option();
		productpage.Verify_click_on_about_option_on_menu();
		productpage.Verify_click_on_logout_option_on_menu();
		productpage.Enter_username("standard_user");
		productpage.Enter_passward("secret_sauce");
		productpage.Click_on_login();
		productpage.Verify_click_on_product();
	}
	@Test(testName= "Verify_product_details_page",priority= 3 )
	public void Verify_product_details_page() throws InterruptedException{
		product_details_page.Verify_click_on_add_to_cart();
		product_details_page.Verify_click_on_remove_option();
		product_details_page.click_on_back_to_product();
		product_details_page.click_on_add_to_cart_icon();
	}
	@Test(testName= "click_on_checkout_button",priority= 4 )
	public void click_on_checkout_button() throws InterruptedException{
		your_cart_page.click_on_checkout_button();
	}
	@Test(testName= "Enter_details",priority= 5 )
	 public void Enter_details() throws InterruptedException{
		 your_information_page.enter_first_name_last_name_zip_code_and_click_on_continue();
	 }
	@Test(testName= "Click_on_finish",priority= 6 )
	public void Click_on_finish() throws InterruptedException{
		overview_page.Click_on_finish();
	}
	@Test(testName= "Verify_Thank_you_for_your_order_Message",priority= 7 )
	public void Verify_Thank_you_for_your_order_Message() throws InterruptedException{
		complete_page.Verify_Thank_you_for_your_order_Message();

}
}