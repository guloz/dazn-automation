package e2eTestFramework.tests;

import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import e2eTestFramework.common.BaseTest;
import e2eTestFramework.pages.LandingPage;
import e2eTestFramework.pages.SignInPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static e2eTestFramework.pages.LandingPage.*;

@RunWith(DataProviderRunner.class)
public class test_SignIn extends BaseTest {

    LandingPage landingPage;
    SignInPage signInPage;

    @Test
    public void signIn() {
        WebDriver driver;
        System.setProperty(CHROME_DRIVER, CHROME_DRIVER_LOCATION);
        driver =new ChromeDriver();

        openLandingPage(driver);

//        driver.quit();
    }
}
