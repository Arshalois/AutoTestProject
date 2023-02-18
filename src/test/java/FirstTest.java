import com.google.common.annotations.VisibleForTesting;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstTest extends BaseTest{
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

}

