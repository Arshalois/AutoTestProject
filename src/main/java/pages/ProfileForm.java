package pages;

import com.sun.org.apache.regexp.internal.RE;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.testng.Assert;

import com.sun.org.apache.regexp.internal.RE;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfileForm extends BaseP{
   // private final static String TITLE = "ProfileForm";
    private WebElement youRepositoriesBtn = driver.findElement(By.xpath("//a[text()='Your repositories']"));
    private By signOutBtn = By.xpath("//button[contains(text(),'Sign out')]");
    private By sloganLocator = By.xpath("//h1");

    public ProfileForm(WebDriver driver) {
        super(driver);
    }
    public RepositoriesPage goToRepositoriesPage(){
        youRepositoriesBtn.click();
        return new RepositoriesPage(driver);
    }

    public HomePage sinOutFromGitHub(){
        //Assert.assertTrue(driver.findElement(signOutBtn).isDisplayed());
        driver.findElement(signOutBtn).click();
      //  Assert.assertEquals("Let's build from here", driver.findElement(sloganLocator).getText());
        return new HomePage(driver);
    }
}

