package e2eTestFramework.tests;

import e2eTestFramework.common.BaseTest;
import e2eTestFramework.pages.SignInPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInTest extends BaseTest {

    private WebDriver driver;
    private SignInPage signInPage;

    @Before
    public void setUp() {
        System.setProperty(CHROME_DRIVER, CHROME_DRIVER_LOCATION);
        driver = new ChromeDriver();
        signInPage = new SignInPage(driver);
    }

    @Test
    public void signIn_checkCorrectTextExist() {

        signInPage.openSignInPage();
        signInPage.waitUntilLogoPresent();
        signInPage.checkText_SignIn_Title();
        signInPage.checkLinkTextsExist();
//        signInPage.isElementPresent(signInPage.startWatchingElement);
//        signInPage.checkLandingPageFooterUrlValues();
//        signInPage.fillinAndSubmitSignInForm();
        driver.quit();

    }
}

