package e2eTestFramework.tests;

import e2eTestFramework.common.BaseTest;
import e2eTestFramework.pages.LandingPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


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
    public void signIn_checkCorrectTextExist() {

        landingPage.openLandingPage();
        landingPage.waitUntilLogoPresent();
        landingPage.checkPageText();

        //        driver.quit();
    }
}

