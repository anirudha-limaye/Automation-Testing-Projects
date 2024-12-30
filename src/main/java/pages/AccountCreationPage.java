package pages;
import org.openqa.By;
import org.openqa.WebDriver;

public class AccountCreationPage
{
  WebDriver driver;

  By firstName = By.id("firstname");
  By lastName = By.id("lastname");
  By email = By.id("email_address");
  By password = By.id("password");
  By confirmPassword = By.id("confirmation");
  By createAccountButton = By.cssSelector("button[title='Create an account']");

  public AccountCreationPage(WebDriver driver)
  {
    this.driver = driver;
  }
  public void setFirstName(String fname)
  {
    driver.findElement(firstname).sendKeys(fname);
  }
  public void setLastName(String lname)
  {
    driver.findElement(lastName).sendKeys(lname);
  }
  public void setEmail(String userEmail)
  {
    driver.findElement(email).sendKeys(userEmail);
  }
  public void setPassword(String pwd)
  {
    driver.findElement(password).sendKeys(pwd);
  }
  public void setConfirmPassword(String cpwd)
  {
    driver.findElement(confirmPassword).sendKeys(cpwd);
  }
  public void clickCreateAccount()
  {
    driver.findElement(createAccountButton).click();
  }
}
