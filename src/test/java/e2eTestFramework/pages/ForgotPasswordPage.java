package e2eTestFramework.pages;

import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswordPage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a.linkButton")
    @CacheLookup
    private WebElement forgotEmailAddress;

    private final String pageLoadedText = "ti=5318804&amp;amp;Ver=2\" height=\"0\" width=\"0\" style=\"display:none; visibility: hidden;\"&gt;";

    private final String pageUrl = "/en-DE/account/forgot-password";

    @FindBy(name = "email")
    @CacheLookup
    private WebElement resetYourPasswordpleaseEnterYourEmail;

    @FindBy(css = "button.Button.SubmitButton.primary.disabled.centerBtn")
    @CacheLookup
    private WebElement send;


    public ForgotPasswordPage() {
    }

    public ForgotPasswordPage(WebDriver driver) {
        this();
        this.driver = driver;
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
