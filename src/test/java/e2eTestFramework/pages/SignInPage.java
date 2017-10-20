package e2eTestFramework.pages;

import e2eTestFramework.common.PageObject;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static junit.framework.Assert.assertEquals;

public class SignInPage extends PageObject{

    private int timeout = 15;

    private static final String USER_EMAIL_ELEMENT =            "id(\"app\")/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]";
    private static final String USER_PASSWORD_ELEMENT=          "id(\"app\")/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]";
    private static final String SUBMIT_BUTTON =                 "//*[@id=\"app\"]/div/div[1]/div[1]/div[2]/form/div[3]/button/span[2]";
    private static final String SIGN_IN_TITLE_ELEMENT =         "id(\"app\")/div[1]/div[1]/div[1]/div[2]/h1[1]";
    private static final String FORGOT_PASSWORD_LINK_ELEMENT =  "id(\"app\")/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/p[1]/a[1]";
    private static final String NEW_TO_DAZN =                   "id(\"app\")/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/p[1]/span[1]";
    private static final String SIGN_UP_LINK_ELEMENT =          "id(\"app\")/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/p[1]/a[1]";


    private static final String SIGN_IN_TITLE_TEXT=             "SIGN IN";
    private static final String SIGN_UP_LINK_TEXT=              "SIGN UP";
    private static final String FORGOT_PASSWORD_TEXT=           "password?";
    private static final String SIGNIN_DAZN_LOGO =              "id(\"app\")/div[1]/div[1]/div[1]/div[1]";

    private static final String SIGNIN_HELP_ELEMENT =            "id(\"app\")/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]";
    private static final String SIGNIN_TERMSOFUSE_ELEMENT =      "id(\"app\")/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/a[1]";
    private static final String SIGNIN_FAQ_ELEMENT =             "id(\"app\")/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/a[1]";
    private static final String SIGNIN_PRIVACY_ELEMENT =         "id(\"app\")/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[4]/a[1]";
    private static final String SIGNIN_REDEEM_ELEMENT =          "id(\"app\")/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[5]/a[1]";
    private static final String SIGNIN_IMPRINT_ELEMENT =         "id(\"app\")/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[6]/a[1]";

    @FindBy(className = SIGNIN_DAZN_LOGO)
    @CacheLookup
    public WebElement signin_daznlogo;

    @FindBy(xpath = USER_EMAIL_ELEMENT)
    @CacheLookup
    public WebElement userEmailElement;

    @FindBy(xpath = USER_PASSWORD_ELEMENT)
    @CacheLookup
    public WebElement userPasswordElement;

    @FindBy(xpath = SUBMIT_BUTTON)
    @CacheLookup
    public WebElement startWatchingElement;

    @FindBy(xpath = SIGN_IN_TITLE_ELEMENT)
    @CacheLookup
    private WebElement singinTitleElement;

    @FindBy(xpath = SIGN_UP_LINK_ELEMENT)
    @CacheLookup
    private WebElement signUplinkElement;

    @FindBy(xpath = FORGOT_PASSWORD_LINK_ELEMENT)
    @CacheLookup
    private WebElement forgotPasswordLinkElement;

    @FindBy(className = DAZN_LOGO)
    @CacheLookup
    private WebElement daznlogo;

    @FindBy(xpath = SIGNIN_FAQ_ELEMENT)
    @CacheLookup
    private WebElement faqElement;

    @FindBy(xpath = SIGNIN_HELP_ELEMENT)
    @CacheLookup
    private WebElement helpElement;

    @FindBy(xpath = SIGNIN_IMPRINT_ELEMENT)
    @CacheLookup
    private WebElement imprintElement;

    @FindBy(xpath = SIGNIN_REDEEM_ELEMENT)
    @CacheLookup
    private WebElement redeemElement;

    @FindBy(xpath = SIGNIN_PRIVACY_ELEMENT)
    @CacheLookup
    private WebElement privacyElement;

    @FindBy(xpath = SIGNIN_TERMSOFUSE_ELEMENT)
    @CacheLookup
    private WebElement termsOfUseElement;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void openSignInPage()
    {
        driver.get(SIGN_IN_URL);
    }

    public void waitUntilLogoPresent() {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("Logo")));
    }

    public void checkText_SignIn_Title() {
        assertEquals(SIGN_IN_TITLE_TEXT, singinTitleElement.getText());
    }


    public void checkLinkTextsExist()
    {
        assertEquals(SIGN_UP_LINK_TEXT, signUplinkElement.getText());
        assertEquals(FORGOT_PASSWORD_TEXT, forgotPasswordLinkElement.getText());

    }

    public boolean isElementPresent(WebElement element){
        {
            if (element == null)
            { return false; }
            return true;
        }
    }


    public void fillinAndSubmitSignInForm() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("SignInView")));
        userEmailElement.sendKeys("daznautomation@gmail.com");
        userPasswordElement.sendKeys("123456");
        startWatchingElement.click();
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
                return d.getCurrentUrl().contains(SIGN_IN_URL);
            }
        });
        return this;
    }

    public void checkSingInPageFooterUrlValues(){
        Assert.assertEquals(HELP_URL ,helpElement.getAttribute("href"));
        Assert.assertEquals(FAQ_URL, faqElement.getAttribute("href"));
        Assert.assertEquals(PRIVACY_URL, privacyElement.getAttribute("href"));
        Assert.assertEquals(TERMS_OF_USE_URL, termsOfUseElement.getAttribute("href"));
        Assert.assertEquals(IMPRINT_URL, imprintElement.getAttribute("href"));
        Assert.assertEquals(REDEEM_URL, redeemElement.getAttribute("href"));
    }
}