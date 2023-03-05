package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BaseP{
   // private WebElement myIssue = driver.findElement(By.id("issue_9_link"));
    WebElement img = driver.findElement(By.xpath("//summary[@aria-label='View profile and more']"));
    public MainPage(WebDriver driver) {
        super(driver);
    }

   /* public IssueMain clickOnMyIssue (){
        myIssue.click();
        return new IssueMain(driver);
    }

    */
    public ProfileForm goToProfileForm() {
        //driver.get("https://github.com/Arshalois?tab=repositories");
        //driver.get("https://github.com/Arshalois/HomeWork");
        img.click();
        return new ProfileForm(driver);
    }







}
