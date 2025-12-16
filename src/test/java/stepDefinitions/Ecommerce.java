package stepDefinitions;

import congfig.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.EcommercePages;

import static utils.Constants.AUTOMATION_EXERCISE;

public class Ecommerce {

    WebDriver driver = DriverFactory.getDriver();
    EcommercePages ecommercePages = new EcommercePages(driver);

    @Given("I am on the landing page")
    public void i_am_on_the_landing_page() {
        driver = DriverFactory.getDriver();
        Assert.assertTrue(driver.getTitle().contains(AUTOMATION_EXERCISE));
    }

    @Then("User clicks on login button")
    public void user_clicks_on_login_button() {
        ecommercePages.clickLoginButton();
    }
    @Then("User enters email and password")
    public void user_enters_email_and_password() {
        ecommercePages.enterEmail("nuwanihansi@gmail.com");
        ecommercePages.enterPassword("12345");
    }
    @Then("User clicks on login")
    public void user_clicks_on_login() {
        ecommercePages.clickLoginInLoginPage();
    }
    @Then("User validates if login is success")
    public void user_validates_if_login_is_success() {
        Assert.assertTrue(ecommercePages.checkLoginSuccess());
    }
    @Then("User perform validation on the Home page")
    public void user_perform_validation_on_the_home_page() {
        ecommercePages.performValidationOnHomePage();
    }
    @When("User clicks on products")
    public void user_clicks_on_products() {
        ecommercePages.clickProductBtn();
    }
    @Then("User performs the validation on the product listing page")
    public void user_performs_the_validation_on_the_product_listing_page() {
        ecommercePages.performValidationOnProductListingPage();
    }
    @Then("User clicks on view product")
    public void user_clicks_on_view_product() {
        ecommercePages.clickViewProductBtn();
    }
    @Then("User  performs validation on product description page")
    public void user_performs_validation_on_product_description_page() {
        ecommercePages.performValidationOnPDP();
    }
    @Then("User clicks on add to cart")
    public void user_clicks_on_add_to_cart() {
        ecommercePages.addToCartBtn();
    }
    @Then("User validates the pop up")
    public void user_validates_the_pop_up() {
        ecommercePages.viewTextInPopup();
    }
    @When("User clicks on view cart")
    public void user_clicks_on_view_cart() {
        ecommercePages.clickOnViewCart();
    }
    @Then("User performs validation on the cart page")
    public void user_performs_validation_on_the_cart_page() {
        ecommercePages.performValidationOnCart();
    }
    @When("User clicks on proceed to checkout")
    public void user_clicks_on_proceed_to_checkout() {
        ecommercePages.clickOnProceedToCheckout();
    }
    @Then("User performs validation on the checkout page")
    public void user_performs_validation_on_the_checkout_page() {
        ecommercePages.performValidationOnCheckoutPage();
    }
    @When("User clicks on place order button")
    public void user_clicks_on_place_order_button() {
        ecommercePages.clickOnPlaceOrderBtn();
    }
    @Then("User enters the payment details")
    public void user_enters_the_payment_details() {
        ecommercePages.enterCardDetails();
    }
    @Then("User clicks on pay and confirm button")
    public void user_clicks_on_pay_and_confirm_button() {
        ecommercePages.userClicksOnPayAndConfirmBtn();
    }
    @Then("User validates the order confirmation message")
    public void user_validates_the_order_confirmation_message() {
        ecommercePages.validateOrderPlacedSuccessfully();
    }
}
