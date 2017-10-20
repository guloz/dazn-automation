package e2eTestFramework.pages;

import e2eTestFramework.common.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

public class HomeScheduleSports  extends PageObject {

    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    private final String pageUrl = "";
    private static final String HOME_HELP_ELEMENT = "";
    private static final String HOME_TERMSOFUSE_ELEMENT = "";
    private static final String HOME_FAQ_ELEMENT = "";
    private static final String HOME_PRIVACY_ELEMENT = "";
    private static final String HOME_REDEEM_ELEMENT = "";
    private static final String HOME_IMPRINT_ELEMENT = "";


    private final String HOMELINK_ELEMENT = "";
    private final String SCHEDULELINK_ELEMENT = "";
    private final String SPORTSLINK_ELEMENT = "";


    @FindBy(name = HOMELINK_ELEMENT)
    @CacheLookup
    private WebElement homeLink;

    @FindBy(name = SCHEDULELINK_ELEMENT)
    @CacheLookup
    private WebElement scheduleLink;

    @FindBy(name = SPORTSLINK_ELEMENT)
    @CacheLookup
    private WebElement sportsLink;

    @FindBy(xpath = HOME_FAQ_ELEMENT)
    @CacheLookup
    private WebElement faqElement;

    @FindBy(xpath = HOME_HELP_ELEMENT)
    @CacheLookup
    private WebElement helpElement;

    @FindBy(xpath = HOME_IMPRINT_ELEMENT)
    @CacheLookup
    private WebElement imprintElement;

    @FindBy(xpath = HOME_REDEEM_ELEMENT)
    @CacheLookup
    private WebElement redeemElement;

    @FindBy(xpath = HOME_PRIVACY_ELEMENT)
    @CacheLookup
    private WebElement privacyElement;

    @FindBy(xpath = HOME_TERMSOFUSE_ELEMENT)
    @CacheLookup
    private WebElement termsOfUseElement;


    public HomeScheduleSports(WebDriver driver) {
        super(driver);
    }

    public void waitForHomeLinkToLoadOnPage() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HOMELINK_ELEMENT)));
    }

    public HomeScheduleSports verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
