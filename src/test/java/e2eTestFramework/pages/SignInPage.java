package e2eTestFramework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
    private WebElement xxx;

    @FindBy(name = "password")
    @CacheLookup
    private WebElement xxxx;

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

    public void fillinAndSubmitSignInForm() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("SignInView")));
        driver.findElement(By.name("email")).sendKeys("daznautomation@gmail.com");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.name("submitButton")).click();
    }


    public SignInPage setSignInemailAddresspasswordforgotYourPassword1PasswordField() {
        return setSignInemailAddresspasswordforgotYourPassword1PasswordField(data.get("SIGN_INEMAIL_ADDRESSPASSWORDFORGOT_YOUR_PASSWORD_1"));
    }


    public SignInPage setSignInemailAddresspasswordforgotYourPassword1PasswordField(String signInemailAddresspasswordforgotYourPassword1Value) {
        xxx.sendKeys(signInemailAddresspasswordforgotYourPassword1Value);
        return this;
    }


    public SignInPage setSignInemailAddresspasswordforgotYourPassword2PasswordField() {
        return setSignInemailAddresspasswordforgotYourPassword2PasswordField(data.get("SIGN_INEMAIL_ADDRESSPASSWORDFORGOT_YOUR_PASSWORD_2"));
    }


    public SignInPage setSignInemailAddresspasswordforgotYourPassword2PasswordField(String signInemailAddresspasswordforgotYourPassword2Value) {
        xxxx.sendKeys(signInemailAddresspasswordforgotYourPassword2Value);
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