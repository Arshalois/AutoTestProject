package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GitHubLink extends BaseP{
   // private WebElement previewBtn = driver.findElement(By.xpath( "//*[@class='btn-link tabnav-tab preview-tab js-preview-tab flex-1 flex-md-auto']"));
  //  private WebElement gitHublink = driver.findElement(By.xpath( "//a[contains(text(),'GitHub Community Guidelines')]//parent::div"));
    private WebElement article = driver.findElement(By.xpath( "//*[@class='btn btn-outline mt-2']"));
    public GitHubLink(WebDriver driver) {
        super(driver);
    }
    public GitHubLink clickOnGitHubArticle(){
        article.click();
        return new GitHubLink(driver);
    }
 /*   public GitHubLink clickOnGitHubLink(){
        //previewBtn.click();
        gitHublink.click();
        return new GitHubLink(driver);
    }

  */
}