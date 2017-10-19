package e2eTestFramework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

public class SignInPage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    private final String pageUrl = "/en-DE/account/signin";

    @FindBy(css = "a[href='/account/forgot-password']")
    @CacheLookup
    private WebElement password;

    @FindBy(name = "email")
    @CacheLookup
    private WebElement signInemailAddresspasswordforgotYourPassword1;

    @FindBy(name = "password")
    @CacheLookup
    private WebElement signInemailAddresspasswordforgotYourPassword2;

    @FindBy(css = "a[href='/account/signup']")
    @CacheLookup
    private WebElement signUp;

    @FindBy(css = "")
    @CacheLookup
    private WebElement startWatching;

    public SignInPage() {
    }

    public SignInPage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public SignInPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public SignInPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }


    public SignInPage clickPasswordLink() {
        password.click();
        return this;
    }


    public SignInPage clickSignUpLink() {
        signUp.click();
        return this;
    }


    public SignInPage clickStartWatchingButton() {
        startWatching.click();
        return this;
    }


    public SignInPage fill() {
        setSignInemailAddresspasswordforgotYourPassword1PasswordField();
        setSignInemailAddresspasswordforgotYourPassword2PasswordField();
        return this;
    }

    public SignInPage fillAndSubmit() {
        fill();
        return submit();
    }


    public SignInPage setSignInemailAddresspasswordforgotYourPassword1PasswordField() {
        return setSignInemailAddresspasswordforgotYourPassword1PasswordField(data.get("SIGN_INEMAIL_ADDRESSPASSWORDFORGOT_YOUR_PASSWORD_1"));
    }


    public SignInPage setSignInemailAddresspasswordforgotYourPassword1PasswordField(String signInemailAddresspasswordforgotYourPassword1Value) {
        signInemailAddresspasswordforgotYourPassword1.sendKeys(signInemailAddresspasswordforgotYourPassword1Value);
        return this;
    }


    public SignInPage setSignInemailAddresspasswordforgotYourPassword2PasswordField() {
        return setSignInemailAddresspasswordforgotYourPassword2PasswordField(data.get("SIGN_INEMAIL_ADDRESSPASSWORDFORGOT_YOUR_PASSWORD_2"));
    }


    public SignInPage setSignInemailAddresspasswordforgotYourPassword2PasswordField(String signInemailAddresspasswordforgotYourPassword2Value) {
        signInemailAddresspasswordforgotYourPassword2.sendKeys(signInemailAddresspasswordforgotYourPassword2Value);
        return this;
    }


    public SignInPage submit() {
        clickStartWatchingButton();
        return this;
    }


    public SignInPage verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains("pageLoadedText");
            }
        });
        return this;
    }

    public SignInPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}