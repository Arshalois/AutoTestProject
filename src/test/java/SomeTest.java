import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.*;

import java.util.ArrayList;
import java.util.List;

public class SomeTest extends BaseTest {
    @Test
    public void checkLogoOnTheLoginPage() {
        //треба об'єкт створити, бо метод не статик
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        Assertions.assertTrue(loginPage.getLogo().isDisplayed());
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
        expectedRepList.add("HomeWork");
        expectedRepList.add("AutoTestProject");
        RepositoriesPage repositoriesPage = new RepositoriesPage(driver);
        Assertions.assertEquals(expectedRepList, repositoriesPage.getRepositories());
    }

    @Test //HW
    public void testIssuesTabDraft() {
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.successfulLogIn("Arshalois", "69111527Aa");

        IssuesPage issuesPage = new IssuesPage(driver);
        issuesPage.goToIssuesPage();
        IssueMain issueMain = new IssueMain(driver);
        issueMain.clickOnMyIssue();

        GitHubLink gitHubLink = new GitHubLink(driver);
        gitHubLink.clickOnGitHubLink();

        // IssueMain issueMain = new IssueMain(driver);
        // issueMain.goBackToIssues();
    }
}
