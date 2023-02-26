package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GitHubLink extends BaseP{
    private final static String TITLE = "Git Hub";
    //private WebElement previewBtn = driver.findElement(By.xpath( "//*[@class='btn-link tabnav-tab preview-tab js-preview-tab flex-1 flex-md-auto']"));
    private WebElement gitHublink = driver.findElement(By.xpath( "//a[contains(text(),'GitHub Community Guidelines')]//parent::div"));
    public GitHubLink(WebDriver driver) {
        super(driver, TITLE);
    }
    public GitHubLink clickOnGitHubLink(){
        gitHublink.click();
        return new GitHubLink(driver);
    }
}