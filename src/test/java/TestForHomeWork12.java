import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.*;

import java.util.ArrayList;
import java.util.List;

public class TestForHomeWork12 extends BaseTest {
   @Test
   public void precondition(){
       System.out.println("I am precondition");
       Assert.assertTrue(true);
   }

   @Test(dependsOnMethods = "precondition")
    public void checkLogoOnTheLoginPage(){
       HomePage homePage = new HomePage(driver);
       homePage.goToLoginPage();
       LoginPage loginPage = new LoginPage(driver);
       Assert.assertTrue(loginPage.getLogo().isDisplayed());
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
      Assert.assertEquals(expectedRepList, repositoriesPage.getRepositories());
  }


    @DataProvider(name = "dataProvider2")
    public Object[][] credentialProvider() {
        return new Object[][]{
                {"sdasdas@gmail.com", "Arsois"}, {"sdadssdas@gmail.com", "Agfis"}, {"sdasdas@gmail.comf", "Ahhlois"}
        };}
        @Test(dataProvider = "dataProvider2")
        public void verifyNegativeLoginTest(String login, String password){
            HomePage homePage = new HomePage(driver);
            homePage.goToLoginPage();
            LoginPage loginPage = new LoginPage(driver);
            System.out.println("login test passed");
        }


    @Test
    public void GoToIssuePage() {
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

        //issuesPage.goToIssuesPage();
       // NewIssuePage newIssuePage = new NewIssuePage(driver);
       // newIssuePage.createNewIss();
        GitHubLink gitHubLink = new GitHubLink(driver);
        gitHubLink.clickOnGitHubLink();


}}
