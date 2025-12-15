package stepDefinitions;

import congfig.DriverFactory;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static utils.Constants.AUTOMATION_EXERCISE;

public class Ecommerce {

    WebDriver driver;

    @Given("I am on the landing page")
    public void i_am_on_the_landing_page() {
        driver = DriverFactory.getDriver();
        Assert.assertTrue(driver.getTitle().contains(AUTOMATION_EXERCISE));
    }
}
