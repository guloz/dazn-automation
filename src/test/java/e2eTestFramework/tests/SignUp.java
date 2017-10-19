package e2eTestFramework.tests;

import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import e2eTestFramework.common.BaseTest;
import e2eTestFramework.common.PageObject;
import e2eTestFramework.pages.LandingPage;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static e2eTestFramework.common.PageObject.LANDING_PAGE_TITLE;
import static e2eTestFramework.pages.LandingPage.BASE_URL;

import static org.junit.Assert.assertEquals;
@RunWith(DataProviderRunner.class)
public class SignUp extends BaseTest {

    PageObject pageObject;
    LandingPage landingPage;

//    @DataProvider
//    public static Object[][] landingPageElements() {
//        return new Object[][]{
//
//                {BASE_URL}
//        };
//    }


    @Test
//    @UseDataProvider("landingPageElements")
        public void signUp(WebDriver driver) {

        this.landingPage.clickFaqLink();
        assertEquals(LANDING_PAGE_TITLE, driver.getTitle());
        assertEquals(BASE_URL, driver.getCurrentUrl());
        this.landingPage.clickFaqLink();

        driver.quit();
    }
}

