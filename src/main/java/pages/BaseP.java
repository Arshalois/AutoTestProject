package pages;

import helpers.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import static helpers.ColorPrinter.printColorMessage;

abstract public class BaseP {
    protected WebDriver driver;

    private String title;
      static Logger log;


    public BaseP(WebDriver driver, String title){
        this.driver = driver;
        this.title = title;
        this.log = LogManager.getLogger(this.title);
       printColorMessage("Page object of " + title +this.getClass().getName(), log, Level.DEBUG);

    }
}
