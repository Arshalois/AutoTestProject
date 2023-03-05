
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BaseP;

public class NewIssuePage extends BaseP {
    // private WebElement createNewIssue = driver.findElement(By.xpath( "//*[@class='d-none d-md-block']"));

    private WebElement createNewIssue = driver.findElement(By.xpath( "//*[@class='d-none d-md-block']"));

    public NewIssuePage(WebDriver driver) {
        super(driver);
    }
    public NewIssuePage createNewIss(){
        createNewIssue.click();
        return new NewIssuePage(driver);
    }
}