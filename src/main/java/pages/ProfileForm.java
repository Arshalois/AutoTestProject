package pages;

import com.sun.org.apache.regexp.internal.RE;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfileForm extends BaseP{
   private WebElement youRepositoriesBtn = driver.findElement(By.xpath("//a[text()='Your repositories']"));
    public ProfileForm(WebDriver driver) {
        super(driver);
    }
    public RepositoriesPage goToRepositoriesPage(){
        youRepositoriesBtn.click();
        return new RepositoriesPage(driver);
    }
}
