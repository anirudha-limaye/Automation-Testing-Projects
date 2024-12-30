package pages;
import org.openqa.By;
import org.openqa.WebDriver;

public class LoginPage
{
  WebDriver driver;

  
  By email = By.id("email");
  By password = By.id("pass");
  By loginButton = By.id("send2");

  public LoginPage(WebDriver driver)
  {
    this.driver = driver;
  }
  public void setEmail(String userEmail)
  {
    driver.findElement(email).sendKeys(userEmail);
  }
  public void setPassword(String pwd)
  {
    driver.findElement(password).sendKeys(pwd);
  }
  public void clickLogin()
  {
    driver.findElement(loginButton).click();
  }
