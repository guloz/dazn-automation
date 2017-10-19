package e2eTestFramework.tests;

import e2eTestFramework.common.BaseTest;
import e2eTestFramework.pages.LandingPage;
import e2eTestFramework.pages.SignInPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static e2eTestFramework.pages.LandingPage.checkPageText;
import static e2eTestFramework.pages.LandingPage.openLandingPage;

public class test_Landing extends BaseTest {

    LandingPage landingPage;
    SignInPage signInPage;

    @Test
    public void signIn_checkCorrectTextExist() {
        WebDriver driver;
        System.setProperty(CHROME_DRIVER, CHROME_DRIVER_LOCATION);
        driver =new ChromeDriver();

        openLandingPage(driver);
        checkPageText(driver);

//        driver.quit();
    }
}

