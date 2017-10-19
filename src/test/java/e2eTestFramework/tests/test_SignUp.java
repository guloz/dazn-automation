package e2eTestFramework.tests;

import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import e2eTestFramework.common.BaseTest;
import e2eTestFramework.common.PageObject;
import e2eTestFramework.pages.LandingPage;
import e2eTestFramework.pages.SignUpPage;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static e2eTestFramework.common.PageObject.LANDING_PAGE_TITLE;
import static e2eTestFramework.pages.LandingPage.BASE_URL;

import static org.junit.Assert.assertEquals;
@RunWith(DataProviderRunner.class)
public class test_SignUp extends BaseTest {

    PageObject pageObject;
    LandingPage landingPage;
    SignUpPage signUpPage;


    @Test
    public void signUp() {
        WebDriver driver;
        System.setProperty(CHROME_DRIVER, CHROME_DRIVER_LOCATION);
        driver = new ChromeDriver();

        landingPage.openLandingPage(driver);

    }}

