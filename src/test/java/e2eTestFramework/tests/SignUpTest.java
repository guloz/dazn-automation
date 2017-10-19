package e2eTestFramework.tests;

import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import e2eTestFramework.common.BaseTest;
import e2eTestFramework.pages.SignUpPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static e2eTestFramework.common.PageObject.SIGN_IN_URL;

@RunWith(DataProviderRunner.class)
public class SignUpTest extends BaseTest {


    SignUpPage signUpPage;


    @Test
    public void signUp() {
        WebDriver driver;
        System.setProperty(CHROME_DRIVER, CHROME_DRIVER_LOCATION);
        driver = new ChromeDriver();

        driver.get(SIGN_IN_URL);

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("SignInView")));
        driver.findElement(By.name("email")).sendKeys("daznautomation@gmail.com");
        driver.findElement(By.name("password")).sendKeys("123456");

    }
}

