package e2eTestFramework.pages;

import java.util.Map;

import e2eTestFramework.common.PageObject;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage extends PageObject {



    private static final String SIGN_UP_BUTTON = "";
    private static final String SIGN_IN_TEXT_LINK = "/account/signin";

    private final String pageLoadedText = "Live stream on your desktop, tablet, smartphone, Smart TV or games console the best Premier League, LaLiga Santander, NBA, NFL, Darts and many other events in HD";

    private int timeout = 15;


    @FindBy(linkText = SIGN_IN_TEXT_LINK)
    @CacheLookup
    private WebElement signIn;

    @FindBy(linkText = SIGN_UP_BUTTON)
    @CacheLookup
    private WebElement signupbutton;

    public LandingPage(WebDriver driver) {

        super(driver);
    }


    public static void openLandingPage(WebDriver driver) {
        driver.get(BASE_URL);
        driver.findElement(By.linkText("Sign in"));
    }

    public static void clickSignInLink(WebDriver driver) {
        driver.findElement(By.linkText("Sign in")).click();
    }

    public static void checkPageText(WebDriver driver) {
//        WebDriverWait wait = new WebDriverWait(driver, 30);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Dazn")));
        String text = "9,99€ per month after trial, cancel monthly.";
        String langingPageText = driver.findElement(By.xpath("//div[@class='RichText.subtitle']")).getText();
        Assert.assertTrue("Text not found!", langingPageText.contains(text));
 }
    }