import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ProfileForm;

import java.util.ArrayList;
import java.util.List;

public class SomeTest extends BaseTest {
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
        ProfileForm profileForm = new ProfileForm(driver);
        profileForm.goToRepositoriesPage();
        List <String> expectedRepList = new ArrayList<>();
        expectedRepList.add("HomeWork");
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

    @DataProvider(name = "dataProvider1")
    public Object[][] creatorData(){
       return new Object[][]{
               {"Alex", 20}, {"Kate", 18}, {"Mary", 19}
       };
    }
    @Test(dataProvider = "dataProvider1")
       public void verifyData(String n1, Integer n2 ){
        System.out.println(n1 + " " + n2);
    }


}
