package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseP {
    private WebElement loginField = driver.findElement(By.xpath("//input[@id = 'login_field']"));
    private WebElement passwordField = driver.findElement(By.id("password"));
    private WebElement getSignInBtn = driver.findElement(By.xpath("//input[@value='Sign in']"));
    private WebElement logo = driver.findElement(By.className("header-logo"));
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getLogo() { //created getter
        return logo;
    }
    public MainPage successfulLogIn(String login, String password) {
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        getSignInBtn.click();
        return new MainPage(driver);
    }
}
