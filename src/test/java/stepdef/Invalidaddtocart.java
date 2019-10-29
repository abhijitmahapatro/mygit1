package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Invalidaddtocart {
	WebDriver d;
	@Given("Alex is registered with Demowebshop app")
	public void alex_is_registered_with_Demowebshop_app() {
		System.setProperty("webdriver.chrome.driver","C:\\MyDrivers\\chromedriver_win32\\chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("http://demowebshop.tricentis.com/");
	    d.manage().window().maximize();
	    d.findElement(By.xpath("//a[@class='ico-login']")).click();
	    d.findElement(By.xpath("//input[@id='Email']")).sendKeys("abhijit1997bam@gmail.com");
	    d.findElement(By.xpath("//input[@id='Password']")).sendKeys("sinu1997");
	    d.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}

	@When("it searched for computer")
	public void it_searched_for_computer() {
		d.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Computers')]")).click();
	   
	}

	@When("he clicked on shopping cart")
	public void he_clicked_on_shopping_cart() {
		d.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();  
	}

	@Then("no carts is in the shopping cart item found")
	public void no_carts_is_in_the_shopping_cart_item_found() {
		String a_txt = d.findElement(By.xpath("//div[@class='order-summary-content']")).getText();
		String e_txt = "Your Shopping Cart is empty!";
		Assert.assertEquals(e_txt, a_txt);
		d.close();
	}

@Given("above Alex is registered with Demowebshop app")
public void above_Alex_is_registered_with_Demowebshop_app() {
	System.setProperty("webdriver.chrome.driver","C:\\MyDrivers\\chromedriver_win32\\chromedriver.exe");
    d=new ChromeDriver();
    d.get("http://demowebshop.tricentis.com/");
    d.manage().window().maximize();
    d.findElement(By.xpath("//a[@class='ico-login']")).click();
    d.findElement(By.xpath("//input[@id='Email']")).sendKeys("abhijit1997bam@gmail.com");
    d.findElement(By.xpath("//input[@id='Password']")).sendKeys("sinu1997");
    d.findElement(By.xpath("//input[@class='button-1 login-button']")).click(); 
}


@When("above it searched for computer")
public void above_it_searched_for_computer() throws InterruptedException {
	d.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Computers')]")).click();
	d.findElement(By.xpath("//div[@class='sub-category-grid']//div[1]//div[1]//div[1]//a[1]//img[1]")).click();//click on desktop
	d.findElement(By.xpath("//div[@class='page-body']//div[2]//div[1]//div[2]//div[3]//div[2]//input[1]")).click();//add to cart in build your own computer
	Thread.sleep(5000);
	d.findElement(By.xpath("//input[@id='product_attribute_16_3_6_19']")).click();//Hdd add
	d.findElement(By.xpath("//input[@id='add-to-cart-button-16']")).click();//inside add to cart
}

	@When("he clicked on add to cart")
	public void he_clicked_on_add_to_cart() {
		d.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
	}

	@Then("computer is in the shopping cart item")
	public void computer_is_in_the_shopping_cart_item() {
		String a_txt=d.findElement(By.xpath("//input[@name='continueshopping']")).getText();
		String e_txt="continueshopping";
		Assert.assertEquals(e_txt, a_txt);
	   
	}


}
