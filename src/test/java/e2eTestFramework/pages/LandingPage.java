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

public class LandingPage extends PageObject {


    private static final String SIGN_UP_BUTTON = "";
    private static final String SIGN_IN_TEXT_LINK = "/account/signin";
    private static final String RICHTEXT_SUBTITLE_TEXT = "9,99€ per month after trial, cancel monthly.";
    private static final String pageLoadedText = "Live stream on your desktop, tablet, smartphone, Smart TV or games console the best Premier League, LaLiga Santander, NBA, NFL, Darts and many other events in HD";


    private static final String RICHTEXT_SUBTITLE_ELEMENT = "id(\"app\")/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/p[1]";


    private int timeout = 15;

    @FindBy(xpath = RICHTEXT_SUBTITLE_ELEMENT)
    @CacheLookup
    private WebElement richtextSubtitleElement;


    @FindBy(linkText = SIGN_IN_TEXT_LINK)
    @CacheLookup
    private WebElement signIn;


    @FindBy(linkText = SIGN_UP_BUTTON)
    @CacheLookup
    private WebElement signupbutton;

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public void openLandingPage()
    {
        driver.get(BASE_URL);
    }


    public void waitUntilLogoPresent() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("Logo")));
    }


    public void checkPageText() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign in")));
        System.out.println(RICHTEXT_SUBTITLE_TEXT);
        richtextSubtitleElement.getText();
        Assert.assertTrue("Text not found!", richtextSubtitleElement.getText().contains(RICHTEXT_SUBTITLE_TEXT));

    }

    public static void clickSignInLink(WebDriver driver) {
        driver.findElement(By.linkText("Sign in")).click();
    }
}