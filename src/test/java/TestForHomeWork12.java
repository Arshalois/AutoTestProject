import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.*;

import java.util.ArrayList;
import java.util.List;

public class TestForHomeWork12 extends BaseTest {
    @Test
    public void precondition() {
        System.out.println("I am precondition");
        Assert.assertTrue(true);
    }
    @Test(dependsOnMethods = "precondition")
    public void checkLogoOnTheLoginPage() {
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.getLogo().isDisplayed());
    }
    @Test
    public void checkRepositoriesList() {
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successfulLogIn("Arshalois", "69111527Aa");
        MainPage mainPage = new MainPage(driver);
        mainPage.goToProfileForm();
        ProfileForm profileForm = new ProfileForm(driver);
        profileForm.goToRepositoriesPage();
        List<String> expectedRepList = new ArrayList<>();
        expectedRepList.add("BooksWebsite");
        expectedRepList.add("AutoTestProject");
        expectedRepList.add("Cucumber");
        expectedRepList.add("HomeWork");
        RepositoriesPage repositoriesPage = new RepositoriesPage(driver);
        Assert.assertEquals(expectedRepList, repositoriesPage.getRepositories());
    }
    @DataProvider(name = "dataProvider2")
    public Object[][] credentialProvider() {
        return new Object[][]{
                {"sdasdas@gmail.com", "Arsois"}, {"sdadssdas@gmail.com", "Agfis"}, {"sdasdas@gmail.comf", "Ahhlois"}
        };
    }
    @Test(dataProvider = "dataProvider2")
    public void verifyNegativeCredentials(String login, String password) {
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        System.out.println("login test passed");
    }
    @Test
    public void TestIssuePage() {
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successfulLogIn("Arshalois", "69111527Aa");
        IssuesPage issuesPage = new IssuesPage(driver);
        issuesPage.goToIssuesPage();
        IssueMain issueMain = new IssueMain(driver);
        issueMain.clickOnMyIssue();
        IssueEdit issueEdit = new IssueEdit(driver);
        issueEdit.editTheIssue();
    }
    @Test
    public void OpenGitHubArticle() {
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successfulLogIn("Arshalois", "69111527Aa");
        GitHubLink gitHubLink = new GitHubLink(driver);
        gitHubLink.clickOnGitHubArticle();
    }
   @Test
    public void verifyNegativeLogin(){
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginNegative("MArshalois", "69111527Aa");
        loginPage.validateErrorMessage("Incorrect username and password.");
    }
   @Test
    public void verifyLogOutFromGitHub(){
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successfulLogIn("Arshalois", "69111527Aa");
        MainPage mainPage = new MainPage(driver);
        mainPage.goToProfileForm();
        ProfileForm profileForm = new ProfileForm(driver);
        profileForm.sinOutFromGitHub();
    }}
