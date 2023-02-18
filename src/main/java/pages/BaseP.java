package pages;

import org.openqa.selenium.WebDriver;

abstract public class BaseP {
    protected WebDriver driver;

    public BaseP(WebDriver driver){
        this.driver = driver;
    }
}
