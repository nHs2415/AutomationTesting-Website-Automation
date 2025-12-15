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
    public void clickLoginButton() {
        System.out.println("Clicking on login button");
        elementUtil.click(loginLink);
    }
}
