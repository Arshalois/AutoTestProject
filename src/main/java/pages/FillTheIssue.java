package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FillTheIssue extends BaseP {
    private final static String TITLE = "Isuues";
    WebElement titleField = driver.findElement(By.xpath("//input[@required]"));
    WebElement submitNewIssueBtn = driver.findElement(By.xpath("//*[@class='btn-primary btn ml-2']"));
    public FillTheIssue(WebDriver driver) {
        super(driver,TITLE );
    }
    public FillTheIssue newIssueCreated(String title) {
        //titleField.click();
        titleField.sendKeys(title);
        submitNewIssueBtn.click();
        return new FillTheIssue(driver);
    }
}
