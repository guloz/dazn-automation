package e2eTestFramework.tests;

import e2eTestFramework.common.BaseTest;
import e2eTestFramework.pages.MyAccountsPage;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyAccountsTest extends BaseTest{

    private WebDriver driver;
    private MyAccountsPage myAccountsPage;

    @Before
    public void setUp() {
        System.setProperty(CHROME_DRIVER, CHROME_DRIVER_LOCATION);
        driver = new ChromeDriver();
        myAccountsPage = new MyAccountsPage(driver);
    }

        public void testxxx(){

    }
    }

