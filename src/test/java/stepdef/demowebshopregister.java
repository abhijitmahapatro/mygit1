package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class demowebshopregister {
	WebDriver d;
	@Given("user is  on demoweb url")
	public void user_is_on_demoweb_url() {
		System.setProperty("webdriver.chrome.driver","C:\\MyDrivers\\chromedriver_win32\\chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("http://demowebshop.tricentis.com/");
	}

	@Given("user clicks on register button")
	public void user_clicks_on_register_button() {
	  d.findElement(By.xpath("//a[@class='ico-register']")).click();
	}


	@When("user gives correct credentials like {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_gives_correct_credentials_like_and_and_and_and_and(String email , String password , String confirmpassword , String firstname, String lastname, String gender) {
        
		System.out.println(gender);
		if(gender.equalsIgnoreCase("Male"))
		{
        	d.findElement(By.xpath("//label[contains(text(),'Male')]")).click();}
        else
        {
        	d.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
        }
        
        d.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(firstname);
        d.findElement(By.xpath("//input[@id='LastName']")).sendKeys(lastname);
		d.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		d.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
		d.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(confirmpassword);
		d.findElement(By.xpath("//input[@id='register-button']")).click(); 
	}


	@Then("user gets sucessful registration message")
	public void user_gets_sucessful_registration_message() {
		String a_txt= d.getTitle();
		   String e_txt="Demo Web Shop. Register";
		   Assert.assertEquals(e_txt,a_txt);
	     
	}
}
