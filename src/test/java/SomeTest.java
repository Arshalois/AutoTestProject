import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ProfileForm;

import java.util.ArrayList;
import java.util.List;

public class SomeTest extends BaseTest {
   @Test
    public void checkLogoOnTheLoginPage(){
        //треба об'єкт створити, бо метод не статик
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
        ProfileForm profileForm = new ProfileForm(driver);
        profileForm.goToRepositoriesPage();
        List <String> expectedRepList = new ArrayList<>();
        expectedRepList.add("HomeWork")
Assertions.
    }
}
