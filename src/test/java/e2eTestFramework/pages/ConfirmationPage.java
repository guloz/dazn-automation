package e2eTestFramework.pages;

import e2eTestFramework.common.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

public class ConfirmationPage extends PageObject {

    private static final String NEWPAYMENT_HELP_ELEMENT = "";
    private static final String NEWPAYMENT_TERMSOFUSE_ELEMENT = "";
    private static final String NEWPAYMENT_FAQ_ELEMENT = "";
    private static final String NEWPAYMENT_PRIVACY_ELEMENT = "";
    private static final String NEWPAYMENT_REDEEM_ELEMENT = "";
    private static final String NEWPAYMENT_IMPRINT_ELEMENT = "";
    private final String pageLoadedText = "As a new member, your one month free trial starts today";
    private final String pageUrl = "/en-DE/account/confirmation";
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;
    @FindBy(xpath = NEWPAYMENT_FAQ_ELEMENT)
    @CacheLookup
    private WebElement newpayment_faq;

    @FindBy(xpath = NEWPAYMENT_HELP_ELEMENT)
    @CacheLookup
    private WebElement newpayment_help;

    @FindBy(xpath = NEWPAYMENT_IMPRINT_ELEMENT)
    @CacheLookup
    private WebElement newpayment_imprint;


    @FindBy(xpath = NEWPAYMENT_PRIVACY_ELEMENT)
    @CacheLookup
    private WebElement newpayment_privacyPolicy;

    @FindBy(xpath = NEWPAYMENT_REDEEM_ELEMENT)
    @CacheLookup
    private WebElement newpayment_redeem;

    @FindBy(xpath = NEWPAYMENT_TERMSOFUSE_ELEMENT)
    @CacheLookup
    private WebElement newpayment_termsOfUse;

    public ConfirmationPage(WebDriver driver) {
        super(driver);
    }


    public ConfirmationPage clickFaqLink() {
        newpayment_faq.click();
        return this;
    }


    public ConfirmationPage clickHelpLink() {
        newpayment_help.click();
        return this;
    }


    public ConfirmationPage clickImprintLink() {
        newpayment_imprint.click();
        return this;
    }


    public ConfirmationPage clickPrivacyPolicyLink() {
        newpayment_privacyPolicy.click();
        return this;
    }


    public ConfirmationPage clickRedeemLink() {
        newpayment_redeem.click();
        return this;
    }


    public ConfirmationPage clickTermsOfUseLink() {
        newpayment_termsOfUse.click();
        return this;
    }


    public ConfirmationPage verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    public ConfirmationPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
