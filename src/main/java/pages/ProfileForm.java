package pages;

import com.sun.org.apache.regexp.internal.RE;
import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.jupiter.api.Assertions;


public class ProfileForm extends BaseP{
    private final static String TITLE = "ProfileForm";
   private WebElement youRepositoriesBtn = driver.findElement(By.xpath("//a[text()='Your repositories']"));
   private By signOutBtn = By.xpath("//button[contains(text(),'Sign out')]");
    private By sloganLocator = By.xpath("//h1");

    public ProfileForm(WebDriver driver) {
        super(driver, TITLE);
    }
    public RepositoriesPage goToRepositoriesPage(){
        youRepositoriesBtn.click();
        return new RepositoriesPage(driver);
    }

    public HomePage sinOutFromGitHub(){
        Assertions.assertTrue(driver.findElement(signOutBtn).isDisplayed());
        driver.findElement(signOutBtn).click();
Assertions.assertEquals("Let's build from here", driver.findElement(sloganLocator).getText());
    return new HomePage(driver);
    }
}
