package hooks;

import congfig.DriverFactory;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    private WebDriver webDriver;

    @Before
    public void setUp(){
        webDriver = DriverFactory.initBrowser("chrome");
        webDriver.manage().window().maximize();
        webDriver.get("https://automationexercise.com/");
    }

    @After
    public void tearDown(){
        DriverFactory.quitDriver();
    }
}
