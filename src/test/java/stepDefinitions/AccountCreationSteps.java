package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.*;
import pages.AccountCreationPage;

public class AccountCreationSteps
{
  WebDriver driver;
  AccountCreationPage accountcreationpage;
}
@Given("the user is on account creation page")
public void the_user_is_on_account_creation_page()
{
  System.setProperty("webdriver.chorme.chromdriver", "C:Driver/ChromeDriver.exe");
  driver = new ChromeDriver();
  driver.get("https://magento.softwaretestingboard.com/customer/account/create");
  accountcreationpage = new AccountCreationPage(driver);
}
@When("the user enter valid details")
public void the_user_enter_valid_details()
{
  accountcreationpage.setFirstName("George");
  accountcreationpage.setLastName("Tyson");
  accountcreationpage.setEmail("george.tyson@example.com");
  accountcreationpage.setPassword("George123");
  accountcreationpage.setConfirmPassword("George123");
}
@When("ther user clicks on create account button")
public void ther_user_clicks_on_create_account_button()
{
  accountcreationpage.clickCreateAccount();
}
@Then("the account should be created successfully")
public void the_account_should_be_creeated_successfully()
{
  String expectedTitle = "My Account";
  String actualTitle = driver.getTitle();
  if(expetedTitle.equals(actualTitle)){
    System.out.println("Account created successfully");}
  else{
    System.out.println("Account creation failed");}
  driver.quit();
}
