package e2eTestFramework.pages;

import e2eTestFramework.common.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

public class ForgotPasswordPage  extends PageObject {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "")
    @CacheLookup
    private WebElement forgotEmailAddress;

    private final String pageLoadedText = "";

    private final String pageUrl = "/en-DE/account/forgot-password";

    @FindBy(name = "email")
    @CacheLookup
    private WebElement resetYourPasswordpleaseEnterYourEmail;

    @FindBy(css = "")
    @CacheLookup
    private WebElement send;


    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
    }


    public ForgotPasswordPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public ForgotPasswordPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }


    public ForgotPasswordPage clickForgotEmailAddressLink() {
        forgotEmailAddress.click();
        return this;
    }

    public ForgotPasswordPage clickSendButton() {
        send.click();
        return this;
    }

    public ForgotPasswordPage fill() {
        setResetYourPasswordpleaseEnterYourEmailEmailField();
        return this;
    }

    public ForgotPasswordPage fillAndSubmit() {
        fill();
        return submit();
    }

    public ForgotPasswordPage setResetYourPasswordpleaseEnterYourEmailEmailField() {
        return setResetYourPasswordpleaseEnterYourEmailEmailField(data.get("RESET_YOUR_PASSWORDPLEASE_ENTER_YOUR_EMAIL"));
    }


    public ForgotPasswordPage setResetYourPasswordpleaseEnterYourEmailEmailField(String resetYourPasswordpleaseEnterYourEmailValue) {
        resetYourPasswordpleaseEnterYourEmail.sendKeys(resetYourPasswordpleaseEnterYourEmailValue);
        return this;
    }

    public ForgotPasswordPage submit() {
        clickSendButton();
        return this;
    }

}
