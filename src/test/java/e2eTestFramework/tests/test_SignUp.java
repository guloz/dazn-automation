package e2eTestFramework.tests;

import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import e2eTestFramework.common.BaseTest;
import e2eTestFramework.pages.SignUpPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
@RunWith(DataProviderRunner.class)
public class test_SignUp extends BaseTest {


    SignUpPage signUpPage;


    @Test
    public void signUp() {
        WebDriver driver;
        System.setProperty(CHROME_DRIVER, CHROME_DRIVER_LOCATION);
        driver = new ChromeDriver();

    }}

