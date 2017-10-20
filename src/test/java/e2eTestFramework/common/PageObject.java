package e2eTestFramework.common;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ozeli on 15/05/2017.
 */
public class PageObject {


    private static final int TIMEOUT_TEN_SECONDS = 10;
    private static final int POLLING_TIME_IN_MILLISECONDS = 500;

    public WebDriver driver;

    protected static final String BASE_URL = "https://stag.dazn.com/en-DE";
    public static final String SIGN_IN_URL = "https://stag.dazn.com/en-DE/account/signin";
    public static final String SIGN_UP_URL = "https://stag.dazn.com/en-DE/account/signup";

    protected static final String DAZN_LOGO = "Logo";
    protected static final String FAQ_URL = "https://preprod-dazn.cs86.force.com/help/DE-en/FAQ";
    protected static final String TERMS_OF_USE_URL = "https://preprod-dazn.cs86.force.com/help/DE-en/terms";
    protected static final String PRIVACY_URL = "https://preprod-dazn.cs86.force.com/help/DE-en/privacy";
    protected static final String HELP_URL = "https://preprod-dazn.cs86.force.com/help/DE-en";
    protected static final String IMPRINT_URL = "https://preprod-dazn.cs86.force.com/help/DE-en/impressum";
    protected static final String REDEEM_URL = "https://stag.dazn.com/redeem";

    public static final String SIGNIN_LINK_TEXT = "Sign in";
    public static final String HELP_LINK_TEXT = "HELP";
    public static final String TERMSOFUSE_LINK_TEXT = "TERMS OF USE";
    public static final String FAQ_LINK_TEXT = "FAQ";
    public static final String PRIVACY_LINK_TEXT = "PRIVACY POLICY";
    public static final String IMPRINT_LINK_TEXT = "IMPRINT";




    @FindBy(className = DAZN_LOGO)
    @CacheLookup
    private WebElement daznlogo;

    public PageObject(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public String getPageTitle(){
        String title = driver.getTitle();
        return title;
    }

    public void waitUntilLogoPresent() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("Logo")));
    }

    public boolean isElementPresent(WebElement element){
        {
            if (element == null)
            { return false; }
            return true;
        }
    }

    private Wait<WebDriver> getWebDriverWait(WebDriver driver) {
        return (Wait<WebDriver>) new FluentWait<WebDriver>(driver)
                .withTimeout(TIMEOUT_TEN_SECONDS, TimeUnit.SECONDS)
                .pollingEvery(POLLING_TIME_IN_MILLISECONDS, TimeUnit.MILLISECONDS)
                .ignoring(NoSuchElementException.class).withMessage("Time out" + TIMEOUT_TEN_SECONDS + "seconds");
    }

}
