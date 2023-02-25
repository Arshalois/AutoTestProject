import com.google.common.annotations.VisibleForTesting;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class FirstTest extends BaseTest {

   @Test
   public void someChecks(){
    driver.get("https://github.com/login");
    WebElement loginField = driver.findElement(By.xpath("//input[@id = 'login_field']"));
    loginField.sendKeys("Arshalois");
    WebElement passwordField = driver.findElement(By.id("password"));
    passwordField.sendKeys("69111527Aa");

    WebElement getSignInBtn = driver.findElement(By.xpath("//input[@value='Sign in']"));
    getSignInBtn.click();

   }
    @Test
    public void checkLogoOnTheLoginPage() {
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        Assertions.assertTrue(loginPage.getLogo().isDisplayed());
    }
    @Test
    public void checkRepositoriesList(){
            HomePage homePage = new HomePage(driver);
            homePage.goToLoginPage();
            LoginPage loginPage = new LoginPage(driver);
            loginPage.successfulLogIn("Arshalois", "69111527Aa");
            MainPage mainPage = new MainPage(driver);
            mainPage.goToProfileForm();
            ProfileForm profileForm = new ProfileForm(driver);
            profileForm.goToRepositoriesPage();
            List<String> expectedRepList = new ArrayList<>();
            expectedRepList.add("AutoTestProject");
        expectedRepList.add("HomeWork");
            RepositoriesPage repositoriesPage = new RepositoriesPage(driver);
            Assertions.assertEquals(expectedRepList, repositoriesPage.getRepositories());
        }
    @Test
    public void testIssuesTabDraft() {
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.successfulLogIn("Arshalois", "69111527Aa");

        IssuesPage issuesPage = new IssuesPage(driver);
        issuesPage.goToIssuesPage();
        IssueMain issueMain = new IssueMain(driver);
        issueMain.clickOnMyIssue();

        //GitHubLink gitHubLink = new GitHubLink(driver);
        //gitHubLink.clickOnGitHubLink();
  }}