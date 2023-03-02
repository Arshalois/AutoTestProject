package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseP {

    By signInBtn = By.xpath("//a[contains(text(),\"Sign in\")]");
    private By sloganlOCATOR = By.xpath("//h1");
   // private final static String TITLE = "Home page";

    public HomePage (WebDriver driver){

        super(driver);
    }

    public LoginPage goToLoginPage(){
        driver.findElement(signInBtn).click();
        return new LoginPage(driver);
    }
}



