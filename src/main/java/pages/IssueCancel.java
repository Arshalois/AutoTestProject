package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IssueCancel extends BaseP{
    private WebElement cancelIssue = driver.findElement(By.className("js-details-target js-cancel-issue-edit btn-link"));
    private WebElement closeIssue = driver.findElement(By.className("js-form-action-text"));
    public IssueCancel(WebDriver driver) {
        super(driver);
    }
    public IssueCancel cancelTheIssue (){
       cancelIssue.click();
       //closeIssue.click();
        return new IssueCancel(driver);
}}
