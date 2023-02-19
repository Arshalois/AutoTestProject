import org.junit.jupiter.api.Test;
import pages.*;

public class TestForHomeWork9 extends BaseTest {

    //A test to open an existing Issue, clicking to edit it, go back to all Issues and to create a new Issue
    @Test

    public void openExistingIssue() {
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

        //when I cancel or close Issue, the test fails
        //IssueCancel issueCancel = new IssueCancel(driver);
        //issueCancel.cancelTheIssue();

        //so I go back to Issues page and creating a new one
        issuesPage.goToIssuesPage();
        NewIssuePage newIssuePage = new NewIssuePage(driver);
        newIssuePage.createNewIss();

        // I couldn't enter the Title to create new issue
        //FillTheIssue fillTheIssue = new FillTheIssue(driver);
        //fillTheIssue.newIssueCreated("Issue#1");

        //so adding another test
        GitHubLink gitHubLink = new GitHubLink(driver);
        gitHubLink.clickOnGitHubLink();
    }
}
