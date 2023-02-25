package pages;

import helpers.Level;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static helpers.ColorPrinter.printColorMessage;

public class LoginPage extends BaseP {
    private final static String TITLE = "Login page";

    private WebElement loginField = driver.findElement(By.xpath("//input[@id = 'login_field']"));
    private WebElement passwordField = driver.findElement(By.id("password"));
    private WebElement getSignInBtn = driver.findElement(By.xpath("//input[@value='Sign in']"));
    private WebElement logo = driver.findElement(By.className("header-logo"));

    public LoginPage(WebDriver driver) {
        super(driver, TITLE);
    }
    public WebElement getLogo(){ //created getter
        return logo;
    }

    public MainPage successfulLogIn(String login, String password) {
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        getSignInBtn.click();

      log.info("Successful login");
       // printColorMessage("Successful login", log, Level.INFO);
        return new MainPage(driver);
    }
}
