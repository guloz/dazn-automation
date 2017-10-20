package e2eTestFramework.tests;

import e2eTestFramework.common.BaseTest;
import e2eTestFramework.pages.LandingPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static e2eTestFramework.common.PageObject.SIGNIN_LINK_TEXT;


public class LandingPageTest extends BaseTest {

    private WebDriver driver;
    private LandingPage landingPage;

    @Before
    public void setUp() {
        System.setProperty(CHROME_DRIVER, CHROME_DRIVER_LOCATION);
        driver = new ChromeDriver();
        landingPage = new LandingPage(driver);
    }

    @Test
    public void landingPage_checkElementsExist() {
        landingPage.openLandingPage();
        landingPage.waitUntilLogoPresent();
        landingPage.checkText_RichText_Subtitle();
        landingPage.checkLinkTextExist(SIGNIN_LINK_TEXT);
        Assert.assertTrue(landingPage.checkSignUpButtonDisplayed());
        landingPage.checkLandingPageFooterUrlValues();
        landingPage.verifyAllLinkText();
        //driver.quit();
    }
}