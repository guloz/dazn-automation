package e2eTestFramework.tests;

import e2eTestFramework.common.BaseTest;
import e2eTestFramework.pages.HomeScheduleSports;
import e2eTestFramework.pages.SignInPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInTest extends BaseTest {

    private WebDriver driver;
    private SignInPage signInPage;
    private HomeScheduleSports homeScheduleSports;

    @Before
    public void setUp() {
        System.setProperty(CHROME_DRIVER, CHROME_DRIVER_LOCATION);
        driver = new ChromeDriver();
        signInPage = new SignInPage(driver);
    }

    @Test
    public void signInPageTest() {

        signInPage.openSignInPage();
        signInPage.waitUntilLogoPresent();
        signInPage.checkText_SignIn_Title();
        signInPage.checkLinkTextsExist();
        signInPage.isElementPresent(signInPage.startWatchingElement);
        signInPage.checkSingInPageFooterUrlValues();
        signInPage.fillinAndSubmitSignInForm();
        //TODO after submit button, user is on Home Page - VERIFY this by below.
//        homeScheduleSports.waitForHomeLinkToLoadOnPage();
//        homeScheduleSports.verifyPageUrl();

        driver.quit();

    }
}

