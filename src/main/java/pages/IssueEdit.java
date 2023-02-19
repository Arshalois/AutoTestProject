package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IssueEdit extends BaseP{
    private WebElement editIssue = driver.findElement(By.xpath( "//*[@class='btn btn-sm js-details-target d-inline-block float-left float-none m-0 mr-md-0 flex-md-order-2 js-title-edit-button']"));
    public IssueEdit(WebDriver driver) {
        super(driver);
    }
    public IssueEdit editTheIssue (){
        editIssue.click();
        return new IssueEdit(driver);
    }
}
