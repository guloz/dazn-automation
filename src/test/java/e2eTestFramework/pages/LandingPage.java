package e2eTestFramework.pages;

import e2eTestFramework.common.PageObject;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.Assert.assertEquals;

public class LandingPage extends PageObject {


    private static final String RICHTEXT_SUBTITLE_TEXT = "9,99€ per month after trial, cancel monthly.";
    private static final String PAGE_LOADED_TEXT = "Live stream on your desktop, tablet, smartphone, Smart TV or games console the best Premier League, LaLiga Santander, NBA, NFL, Darts and many other events in HD";

    private static final String RICHTEXT_SUBTITLE_ELEMENT = "id(\"app\")/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/p[1]";
    private static final String SIGN_IN_ELEMENT = "id(\"app\")/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/p[1]/a[1]";
    private static final String SIGN_UP_BUTTON = "id(\"app\")/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/span[2]";



    private int timeout = 15;

    @FindBy(xpath = RICHTEXT_SUBTITLE_ELEMENT)
    @CacheLookup
    private WebElement richtextSubtitleElement;


    @FindBy(xpath = SIGN_IN_ELEMENT)
    @CacheLookup
    private WebElement signInLink;


    @FindBy(xpath = SIGN_UP_BUTTON)
    @CacheLookup
    public WebElement signupbutton;

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public void openLandingPage()
    {
        driver.get(BASE_URL);
    }

    public Map<String, WebElement> footerLinks = new HashMap<String, WebElement>() {
        {
            put(HELP_LINK_TEXT, helpElement);
            put(FAQ_LINK_TEXT, faqElement);
            put(TERMSOFUSE_LINK_TEXT, termsOfUseElement);
            put(PRIVACY_LINK_TEXT, privacyElement);
            put(IMPRINT_LINK_TEXT, imprintElement);
        }
    };

    public void waitUntilLogoPresent() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("Logo")));
    }

    public void checkText_RichText_Subtitle() {
        assertEquals(RICHTEXT_SUBTITLE_TEXT, richtextSubtitleElement.getText());
    }

    public void checkLinkTextExist(String linkText) {
        assertEquals(linkText, signInLink.getText());
    }

    public boolean verifyAllLinkText() {
        boolean linkTextMatches = true;
        for (Map.Entry<String, WebElement> entry : footerLinks.entrySet()) {
            if (!(entry.getKey().equals(entry.getValue().getText()))) {
                linkTextMatches = false;
            }
        }
        return linkTextMatches;
    }

    public  void clickSignInLinkByLinkText(WebDriver driver) {
        driver.findElement(By.linkText("Sign in")).click();
    }

    // check sign up button exist
    public boolean checkSignUpButtonDisplayed(){
        Assert.assertEquals(true, signupbutton.isDisplayed());
        return true;
    }

    public boolean isElementPresent(WebElement element){
        {
            if (element == null)
            { return false; }
            return true;
        }
    }

//        Assert.assertEquals(true, rxBtn.isDisplayed());
//
    // check help, faq, terms, privacy links exist
    // follow the links of buttons and linktext to see they work ok

}