package e2eTestFramework.pages;

import java.util.Map;

import e2eTestFramework.common.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage extends PageObject {



    public static final String SIGN_UP_BUTTON = "button.Button.primary.start.enabled";

    private final String pageLoadedText = "Live stream on your desktop, tablet, smartphone, Smart TV or games console the best Premier League, LaLiga Santander, NBA, NFL, Darts and many other events in HD";

    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;


    @FindBy(css = "a[href='/account/signin']")
    @CacheLookup
    private WebElement signIn;


    @FindBy(xpath = SIGN_UP_BUTTON)
    @CacheLookup
    private WebElement startYourFreeMonth1;

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public LandingPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public LandingPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }


    public LandingPage verifyPageLoaded() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(DAZN_LOGO)));
        return this;
    }

    public LandingPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(BASE_URL);
            }
        });
        return this;
    }

    public LandingPage verifyPageTitle(final String pageTitle) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(DAZN_LOGO)));
        return this;
    }

    public LandingPage clickSignInButton() {
        signIn.click();
        return this;
    }

    public LandingPage clickSignInLink() {
        signIn.click();
        return this;
    }

    public LandingPage clickStartYourFreeMonth1Button() {
        startYourFreeMonth1.click();
        return this;
    }

}