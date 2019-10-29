package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class demowebshoplogin {
 WebDriver d;
@Given("user clicks on demoweb url")
public void user_clicks_on_demoweb_url() {
	System.setProperty("webdriver.chrome.driver","C:\\MyDrivers\\chromedriver_win32\\chromedriver.exe");
    d=new ChromeDriver();
    d.get("http://demowebshop.tricentis.com/");
}

@Given("user clicks on login button")
public void user_clicks_on_login_button() {
	d.findElement(By.xpath("//a[@class='ico-login']")).click();
}

@When("user gives correct credentials like {string} and {string}")
public void user_gives_correct_credentials_like_and(String email, String password) {
  d.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
  d.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
  d.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
}

@Then("user moves to home page")
public void user_moves_to_home_page() {
   String a_txt=d.getTitle();
   String e_txt="Demo Web Shop";
   Assert.assertEquals(e_txt, a_txt);
   d.close();
}

}
