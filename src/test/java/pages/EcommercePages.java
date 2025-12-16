package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.ElementUtil;

public class EcommercePages {
    private WebDriver driver;
    private ElementUtil elementUtil;

    public EcommercePages(WebDriver driver) {
        this.driver = driver;
        elementUtil = new ElementUtil(driver);
    }

    private By loginLink = By.xpath("//a[text()=' Signup / Login']");
    private By emailTextBox = By.xpath("(//input[@name='email'])[1]");
    private By passwordTextBox = By.xpath("(//input[@name='password'])[1]");
    private By loginButtonInLoginPage = By.xpath("//button[@data-qa='login-button']");
    private By deleteAccountButton = By.xpath("//a[text()=' Delete Account']");
    private By automationText = By.xpath("//span[text()='Automation']");
    private By categoryTextOnHomePage = By.xpath("//h2[text()='Category']");
    private By featuresItemOnHomePage = By.xpath("//h2[text()='Features Items']");
    private By productsButton = By.xpath("//a[text()=' Products']");
    private By searchText = By.xpath("//input[@name='search']");
    private By searchTextBtn = By.xpath("//i[@class='fa fa-search']");
    private By searchTextHeader = By.xpath("//h2[text()='Searched Products']");
    private By viewProductBtn = By.xpath("//a[text()='View Product'][1]");
    private By rupeeSymbolOnPDP = By.xpath("//span[contains(text(),'Rs')]");
    private By quantity = By.xpath("//input[@name='quantity']");
    private By addToCartBtn = By.xpath("//i[@class='fa fa-shopping-cart']");
    private By viewCartBtn = By.xpath("//u[text()='View Cart']");
    private By viewTextInPopup = By.xpath("//h4[text()='Added!']");
    private By crossBtn = By.xpath("//i[@class='fa fa-times']");
    private By proceedToCheckoutBtn = By.xpath("//a[text()='Proceed To Checkout']");
    private By deliveryAddressText = By.xpath("//h3[text()='Your delivery address']");
    private By placeOrderBtn = By.xpath("//a[text()='Place Order']");
    private By nameOnCardField = By.xpath("//input[@name='name_on_card']");
    private By cardNumberField = By.xpath("//input[@name='card_number']");
    private By cvvField = By.xpath("//input[@name='cvc']");
    private By expirationMonthField = By.xpath("//input[@name='expiry_month']");
    private By payBtn = By.xpath("//button[@id='submit']");
    private By expirationYearField = By.xpath("//button[@id='submit']");


    public void clickLoginButton() {
        elementUtil.click(loginLink);
    }

    public void enterEmail(String email) {
        elementUtil.type(emailTextBox, email);
    }

    public void enterPassword(String password) {
        elementUtil.type(passwordTextBox, password);
    }
    public void clickLoginInLoginPage() {
        elementUtil.click(loginButtonInLoginPage);
    }
    public boolean checkLoginSuccess() {
        return  elementUtil.isDisplayed(deleteAccountButton);
    }
    public void performValidationOnHomePage(){
        Assert.assertTrue(elementUtil.isDisplayed(automationText));
        Assert.assertTrue(elementUtil.isDisplayed(categoryTextOnHomePage));
        Assert.assertTrue(elementUtil.isDisplayed(featuresItemOnHomePage));
    }
    public void clickProductBtn(){
        elementUtil.click(productsButton);
    }
    public void performValidationOnProductListingPage(){
        elementUtil.type(searchText,"men");
        elementUtil.click(searchTextBtn);
        Assert.assertTrue(elementUtil.isDisplayed(searchTextHeader));
    }
    public void clickViewProductBtn(){
        elementUtil.click(viewProductBtn);
    }
    public void performValidationOnPDP(){
        Assert.assertTrue(elementUtil.isDisplayed(rupeeSymbolOnPDP));
        elementUtil.type(quantity,"4");
        elementUtil.click(addToCartBtn);
    }
    public void addToCartBtn(){
        elementUtil.click(addToCartBtn);
    }
    public void viewTextInPopup(){
        Assert.assertTrue(elementUtil.isDisplayed(viewTextInPopup));
    }
    public void clickOnViewCart() {
        elementUtil.click(viewCartBtn);
    }
    public void performValidationOnCart(){
        Assert.assertTrue(elementUtil.isDisplayed(crossBtn));
    }
    public void clickOnProceedToCheckout(){
        elementUtil.click(proceedToCheckoutBtn);
    }
    public void performValidationOnCheckoutPage(){
        Assert.assertTrue(elementUtil.isDisplayed(deliveryAddressText));
    }
    public void clickOnPlaceOrderBtn() {
        elementUtil.click(placeOrderBtn);
    }
    public void enterCardDetails(){
        elementUtil.type(nameOnCardField, "nuwani hansi");
        elementUtil.type(cardNumberField, "123344555");
        elementUtil.type(cvvField, "234");
        elementUtil.type(expirationMonthField, "09");
        elementUtil.type(expirationYearField, "2039");
    }
    public void userClicksOnPayAndConfirmBtn(){
        elementUtil.click(payBtn);
    }
    public void validateOrderPlacedSuccessfully(){
        By orderPlacedText = By.xpath("//b[text()='Order Placed!']");
        Assert.assertTrue(elementUtil.isDisplayed(orderPlacedText));
    }
}
