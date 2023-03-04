package Books;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Books.SearchPage;
import pages.Books.SearchResultsPage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class BooksSearch extends BooksTestBase{



   @Test
    public void goToSearchPage(){
       SearchPage searchPage = new SearchPage(driver);
       searchPage.searchForJavaBooks("Thinking in Java");
       searchPage.clickSearch();
       SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
       searchResultsPage.applySomeFilters();

}}
