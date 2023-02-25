package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IssueMain extends BaseP {
    private final static String TITLE = "Issues main";
    private WebElement myIssue = driver.findElement(By.id("issue_9_link"));


    public IssueMain(WebDriver driver) {
        super(driver, TITLE);
    }
    public IssueMain clickOnMyIssue (){
        myIssue.click();
        return new IssueMain(driver);
    }

    /*public IssueMain goBackToIssues (){
        driver.get("https://github.com/Arshalois/HomeWork/issues");
        return new IssueMain(driver);
}
     */
}