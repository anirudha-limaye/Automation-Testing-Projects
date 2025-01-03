package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.*;
import pages.LoginPage;

public class LoginSteps
{
  WebDriver driver;
  LoginPage loginpage;

@Given("the user is on the login page")
public void the_user_is_on_login_page()
{
  System.setProperty("webdriver.chorme.chromdriver", "C:Driver/ChromeDriver.exe");
  driver = new ChromeDriver();
  driver.get("https://magento.softwaretestingboard.com/customer/account/login");
  loginpage = new AccountCreationPage(driver);
}
@When("the user enter valid details")
public void the_user_enter_valid_details()
{  
  loginpage.setEmail("george.tyson@example.com");
  loginpage.setPassword("George123");
}
@When("the user clicks on the login button")
public void the_user_clicks_on_the_login_button()
{
  loginpage.clickLogin()
}
@Then("the user should be logged in successfully")
public void the_user_should_be_logged_in_successfully()
{
  String expectedTitle = "My Account";
  String actualTitle = driver.getTitle();
  if(expetedTitle.equals(actualTitle)){
    System.out.println("Loggined in  successfully");}
  else{
    System.out.println("Login failed");}
  driver.quit();
}
