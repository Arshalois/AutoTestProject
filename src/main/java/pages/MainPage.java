package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BaseP {
    public MainPage(WebDriver driver) {
        super(driver);
    }
WebElement img = driver.findElement(By.xpath("//summary[@aria-label='View profile and more']"));
    public ProfileForm goToProfileForm() {
        //driver.get("https://github.com/Arshalois?tab=repositories");
        //driver.get("https://github.com/Arshalois/HomeWork");
       img.click();
        return new ProfileForm(driver);
    }

}




