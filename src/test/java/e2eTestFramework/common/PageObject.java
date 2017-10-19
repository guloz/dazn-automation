package e2eTestFramework.common;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ozeli on 15/05/2017.
 */
public class PageObject {


    private static final int TIMEOUT_TEN_SECONDS = 10;
    private static final int POLLING_TIME_IN_MILLISECONDS = 500;

    public WebDriver driver;

    public static final java.lang.String BASE_URL = "https://stag.dazn.com/en-DE";
    public static final java.lang.String SIGN_IN_URL = "https://stag.dazn.com/en-DE/account/signin";
    public static final java.lang.String SIGN_UP_URL = "https://stag.dazn.com/en-DE/account/signup";

    private static final java.lang.String DAZN_LOGO = "Logo";
    private static final java.lang.String FAQ_URL = "https://preprod-dazn.cs86.force.com/help/DE-en/FAQ";
    private static final java.lang.String TERMS_OF_USE_URL = "a[href='https://preprod-dazn.cs86.force.com/help/DE-en/terms']";
    private static final java.lang.String PRIVACY_URL = "a[href='https://preprod-dazn.cs86.force.com/help/DE-en/privacy']";
    private static final java.lang.String HELP_URL = "a[href='https://preprod-dazn.cs86.force.com/help/DE-en']";
    private static final java.lang.String IMPRINT_URL = "a[href='https://preprod-dazn.cs86.force.com/help/DE-en/impressum']";
    private static final java.lang.String LANDING_PAGE_TITLE = "DAZN-Staging";


    public static final java.lang.String HELP_ELEMENT = "id(\"app\")/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/ul[1]/li[1]/a[1]";
    public static final java.lang.String TERMSOFUSE_ELEMENT = "id(\"app\")/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/ul[1]/li[3]/a[1]";
    public static final java.lang.String FAQ_ELEMENT = "id(\"app\")/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/ul[1]/li[2]/a[1]";
    public static final java.lang.String PRIVACY_ELEMENT= "id(\"app\")/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/ul[1]/li[4]/a[1]";
    public static final java.lang.String IMPRINT_ELEMENT ="id(\"app\")/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/ul[1]/li[5]/a[1]";


    public static final java.lang.String SIGNIN_LINK_TEXT = "Sign in";
    public static final java.lang.String HELP_LINK_TEXT = "HELP";
    public static final java.lang.String TERMSOFUSE_LINK_TEXT = "TERMS OF USE";
    public static final java.lang.String FAQ_LINK_TEXT = "FAQ";
    public static final java.lang.String PRIVACY_LINK_TEXT = "PRIVACY POLICY";
    public static final java.lang.String IMPRINT_LINK_TEXT = "IMPRINT";



    @FindBy(className = DAZN_LOGO)
    @CacheLookup
    private WebElement daznlogo;

    @FindBy(xpath = FAQ_ELEMENT)
    @CacheLookup
    protected WebElement faqElement;

    @FindBy(xpath = HELP_ELEMENT)
    @CacheLookup
    protected WebElement helpElement;

    @FindBy(xpath = IMPRINT_ELEMENT)
    @CacheLookup
    protected WebElement imprintElement;

    @FindBy(xpath = PRIVACY_ELEMENT)
    @CacheLookup
    protected WebElement privacyElement;

    @FindBy(xpath = TERMSOFUSE_ELEMENT)
    @CacheLookup
    protected WebElement termsOfUseElement;

    public PageObject(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public java.lang.String getPageTitle(){
        java.lang.String title = driver.getTitle();
        return title;
    }

//    public void clickFaqLink() {
//        faq.click();
//    }
//
    public PageObject clickHelpLink() {
        helpElement.click();
        return this;
    }
//
//    public PageObject clickImprintLink() {
//        imprint.click();
//        return this;
//    }
//
//    public PageObject clickPrivacyPolicyLink() {
//        privacyPolicy.click();
//        return this;
//    }
//
//
//    public PageObject clickTermsOfUseLink() {
//        termsOfUse.click();
//        return this;
//    }

    private Wait<WebDriver> getWebDriverWait(WebDriver driver) {
        return (Wait<WebDriver>) new FluentWait<WebDriver>(driver)
                .withTimeout(TIMEOUT_TEN_SECONDS, TimeUnit.SECONDS)
                .pollingEvery(POLLING_TIME_IN_MILLISECONDS, TimeUnit.MILLISECONDS)
                .ignoring(NoSuchElementException.class).withMessage("Time out" + TIMEOUT_TEN_SECONDS + "seconds");
    }

}
