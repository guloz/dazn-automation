package e2eTestFramework.tests;

import e2eTestFramework.common.BaseTest;
import e2eTestFramework.pages.SignInPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static e2eTestFramework.common.PageObject.SIGN_IN_URL;

public class SignInTest extends BaseTest {

    SignInPage signInPage;

    @Test
    public void signIn_checkCorrectTextExist() {
        WebDriver driver;
        System.setProperty(CHROME_DRIVER, CHROME_DRIVER_LOCATION);
        driver =new ChromeDriver();


        driver.get(SIGN_IN_URL);


    }
}

