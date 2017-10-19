package e2eTestFramework.tests;

import e2eTestFramework.common.BaseTest;
import e2eTestFramework.pages.SignInPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_SignIn extends BaseTest {

    SignInPage signInPage;

    @Test
    public void signIn_checkCorrectTextExist() {
        WebDriver driver;
        System.setProperty(CHROME_DRIVER, CHROME_DRIVER_LOCATION);
        driver =new ChromeDriver();

    }
}

