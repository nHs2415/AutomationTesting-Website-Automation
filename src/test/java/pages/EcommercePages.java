package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
}
