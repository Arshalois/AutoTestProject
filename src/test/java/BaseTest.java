import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    Logger logger;

    @BeforeEach
    void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/arshaluis/IdeaProjects/AutoTestProject/src/main/resources/drivers/chromedriver");
     Logger logger = LogManager.getLogger("Chrome Driver starting");
       logger.info("Smth to test if logs are working");

       driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://github.com");

    }
    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
