package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseP {

    WebElement signInBtn = driver.findElement(By.xpath("//a[contains(text(),\"Sign in\")]"));
private final static String TITLE = "Home page";

    public HomePage (WebDriver driver){ //need to call for parent constructor

        super(driver, TITLE);
    }

    public LoginPage goToLoginPage(){
        signInBtn.click();
        return new LoginPage(driver); //це конст-р
    }
}
