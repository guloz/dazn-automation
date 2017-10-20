package e2eTestFramework.pages;

import e2eTestFramework.common.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

public class HomeScheduleSports  extends PageObject {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    private final String pageUrl = "";


    @FindBy(name = "searchInput")
    @CacheLookup
    private WebElement whatsOnfaqhomemyAccounthelpprivacyPolicytermsAndConditions;


    public HomeScheduleSports(WebDriver driver) {
        super(driver);
    }

    public HomeScheduleSports(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public HomeScheduleSports(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

}
