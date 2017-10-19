package e2eTestFramework.common;

import e2eTestFramework.pages.LandingPage;
import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ozeli on 15/05/2017.
 */
public class PageObject {


    public static final int TIMEOUT_TEN_SECONDS = 10;
    public static final int POLLING_TIME_IN_MILLISECONDS = 500;

    protected java.lang.String pageTitle  ="DAZN-Staging";
    protected WebDriver driver;

    public static final java.lang.String BASE_URL = "https://stag.dazn.com/";
    public static final java.lang.String DAZN_LOGO = "Logo";
    public static final java.lang.String FAQ = "https://preprod-dazn.cs86.force.com/help/DE-en/FAQ";
    public static final java.lang.String TERMS_OF_USE = "a[href='https://preprod-dazn.cs86.force.com/help/DE-en/terms']";
    public static final java.lang.String PRIVACY = "a[href='https://preprod-dazn.cs86.force.com/help/DE-en/privacy']";
    public static final java.lang.String HELP = "a[href='https://preprod-dazn.cs86.force.com/help/DE-en']";
    public static final java.lang.String IMPRINT = "a[href='https://preprod-dazn.cs86.force.com/help/DE-en/impressum']";
    public static final java.lang.String LANDING_PAGE_TITLE = "DAZN-Staging";
    public static final java.lang.String LANDING_URL = BASE_URL+"en-DE";


    @FindBy(className = DAZN_LOGO)
    @CacheLookup
    private WebElement daznlogo;

    @FindBy(linkText = FAQ)
    @CacheLookup
    private WebElement faq;

    @FindBy(css = HELP)
    @CacheLookup
    private WebElement help;

    @FindBy(css = IMPRINT)
    @CacheLookup
    private WebElement imprint;

    @FindBy(css = PRIVACY)
    @CacheLookup
    private WebElement privacyPolicy;

    @FindBy(css = TERMS_OF_USE)
    @CacheLookup
    private WebElement termsOfUse;

    public PageObject(WebDriver driver){
        this.driver = driver;
        this.pageTitle = driver.getTitle();
    }

    public java.lang.String getPageTitle(){
        java.lang.String title = driver.getTitle();
        return title;
    }

    public PageObject clickFaqLink() {
        faq.click();
        return this;
    }

    public PageObject clickHelpLink() {
        help.click();
        return this;
    }

    public PageObject clickImprintLink() {
        imprint.click();
        return this;
    }

    public PageObject clickPrivacyPolicyLink() {
        privacyPolicy.click();
        return this;
    }


    public PageObject clickTermsOfUseLink() {
        termsOfUse.click();
        return this;
    }

    public boolean verifyBasePageTitle() {
        java.lang.String expectedPageTitle=pageTitle;
        return getPageTitle().contains(expectedPageTitle);
    }

    private Wait<WebDriver> getWebDriverWait(WebDriver driver) {
        return (Wait<WebDriver>) new FluentWait<WebDriver>(driver)
                .withTimeout(TIMEOUT_TEN_SECONDS, TimeUnit.SECONDS)
                .pollingEvery(POLLING_TIME_IN_MILLISECONDS, TimeUnit.MILLISECONDS)
                .ignoring(NoSuchElementException.class).withMessage("Time out" + TIMEOUT_TEN_SECONDS + "seconds");
    }

    public PageObject(WebDriver driver, String pageTitle){
        this.driver = driver;
        this.pageTitle = driver.getTitle();
        Wait<WebDriver> wait = getWebDriverWait(driver);
        wait.until(ExpectedConditions.titleContains(java.lang.String.valueOf(pageTitle)));

    }

    public PageObject(WebDriver driver, By locator){
        this.driver = driver;
        this.pageTitle = driver.getTitle();
        Wait<WebDriver> wait = getWebDriverWait(driver);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
}
