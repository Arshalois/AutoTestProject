package selenide;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHub extends BaseTes {

    @Test
    public void successLogin(){
        open("https://github.com/login");
        $(By.xpath("//input[@id='login_field']")).sendKeys("Arshalois");
        $(By.id("password")).sendKeys("69111527Aa");
        $(By.xpath("//input[@value='Sign in']")).click();

    }

    @Test
    public void failedLogin(){
        open("https://github.com/login");
        $(By.xpath("//input[@id='login_field']")).sendKeys("Arrrshalois");
        $(By.id("password")).sendKeys("69111527Aa");
        $(By.xpath("//input[@value='Sign in']")).click();
        $(By.xpath("//div[contains(text(),'Incorrect')]")).shouldHave(Condition.text("Incorrect username or password. "));
    }
}
