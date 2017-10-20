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

    private static final String USER_EMAIL_ELEMENT = "id(\"app\")/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]";
    private static final String USER_PASSWORD = "id(\"app\")/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]";
    private static final String START_WATCHING_BUTTON = "id(\"app\")/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]";
    private static final String SIGN_IN_TITLE_ELEMENT = "id(\"app\")/div[1]/div[1]/div[1]/div[2]/h1[1]";
    private static final String FORGOT_PASSWORD_LINK_ELEMENT = "id(\\\"app\\\")/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/p[1]/a[1]";
    private static final String SIGN_UP_LINK_ELEMENT = "id(\"app\")/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/p[1]/a[1]";

    private static final String SIGN_IN_TITLE_TEXT="SIGN IN";
    private static final String SIGN_UP_LINK_TEXT="SIGN UP";
    private static final String FORGOT_PASSWORD_TEXT="password";
    private static final String SIGNIN_DAZN_LOGO = "id(\"app\")/div[1]/div[1]/div[1]/div[1]";

    @FindBy(className = SIGNIN_DAZN_LOGO)
    @CacheLookup
    public WebElement signin_daznlogo;

    @FindBy(xpath = USER_EMAIL_ELEMENT)
    @CacheLookup
    public WebElement userEmailElement;

    @FindBy(xpath = USER_PASSWORD)
    @CacheLookup
    public WebElement userPasswordElement;

    @FindBy(xpath = START_WATCHING_BUTTON)
    @CacheLookup
    public WebElement startWatchingElement;

    @FindBy(xpath = SIGN_IN_TITLE_ELEMENT)
    @CacheLookup
    public WebElement singinTitleElement;

    @FindBy(xpath = SIGN_UP_LINK_ELEMENT)
    @CacheLookup
    public WebElement signUplinkElement;

    @FindBy(xpath = FORGOT_PASSWORD_LINK_ELEMENT)
    @CacheLookup
    public WebElement forgotPasswordLinkElement;

    @FindBy(className = DAZN_LOGO)
    @CacheLookup
    private WebElement daznlogo;

    @FindBy(xpath = FAQ_ELEMENT)
    @CacheLookup
    protected WebElement faqElement;

    @FindBy(xpath = HELP_ELEMENT)
    @CacheLookup
    public WebElement helpElement;

    @FindBy(xpath = IMPRINT_ELEMENT)
    @CacheLookup
    protected WebElement imprintElement;

    @FindBy(xpath = PRIVACY_ELEMENT)
    @CacheLookup
    protected WebElement privacyElement;

    @FindBy(xpath = TERMSOFUSE_ELEMENT)
    @CacheLookup
    protected WebElement termsOfUseElement;

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
        driver.findElement(By.name("email")).sendKeys("daznautomation@gmail.com");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.name("submitButton")).click();
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

    public void checkLandingPageFooterUrlValues(){
        Assert.assertEquals(helpElement.getAttribute("href"), HELP_URL);
        Assert.assertEquals(faqElement.getAttribute("href"), FAQ_URL);
        Assert.assertEquals(privacyElement.getAttribute("href"), PRIVACY_URL);
        Assert.assertEquals(termsOfUseElement.getAttribute("href"), TERMS_OF_USE_URL);
        Assert.assertEquals(imprintElement.getAttribute("href"), IMPRINT_URL);

    }
}