package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IssuesPage extends BaseP {
    //private WebElement createNewIssue = driver.findElement(By.xpath( "//*[@class='d-none d-md-block']"));
    public IssuesPage(WebDriver driver) {
        super(driver);
    }
    public IssuesPage goToIssuesPage() {
        driver.get("https://github.com/Arshalois/HomeWork/issues");
        return new IssuesPage(driver);
    }

}
