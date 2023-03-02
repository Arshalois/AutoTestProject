package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BaseP{
    private WebElement myIssue = driver.findElement(By.id("issue_9_link"));
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public IssueMain clickOnMyIssue (){
        myIssue.click();
        return new IssueMain(driver);
    }
}
