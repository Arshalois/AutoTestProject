package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LoginPage extends BaseP {

    private WebElement loginField = driver.findElement(By.xpath("//input[@id = 'login_field']"));
    private WebElement passwordField = driver.findElement(By.id("password"));
    private WebElement getSignInBtn = driver.findElement(By.xpath("//input[@value='Sign in']"));
    private WebElement logo = driver.findElement(By.className("header-logo"));
    private By errorMessage = By.xpath("//div[contains(text(),'Incorrect']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getLogo(){ //created getter
        return logo;
    }

    public MainPage successfulLogIn(String login, String password) {
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        getSignInBtn.click();
       // log.info("Successful login");
       // printColorMessage("Successful login", log, Level.INFO);
        return new MainPage(driver);
    }

    public LoginPage loginNegative (String login, String password){
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        getSignInBtn.click();
        return this;
    }

    public LoginPage validateErrorMessage (String expectedMessage){
      //  assertEquals(expectedMessage,driver.findElement(errorMessage).getText());
        return this;
    }
/*
  public LoginPage checkAuthFields(){
        printColorMessage("Authorization fields are validating", log, Level.INFO);
        Assertions.assertTrue(loginField.isDisplayed(), "Login field is visible");
        Assertions.assertTrue(passwordField.isDisplayed(), "Password field is visible");
        Assertions.assertTrue(getSignInBtn.isDisplayed(), "Sign in btn is visible");
return new LoginPage(driver);
    }

 */



}
