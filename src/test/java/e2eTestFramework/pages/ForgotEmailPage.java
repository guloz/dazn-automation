package e2eTestFramework.pages;

import e2eTestFramework.common.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Map;

public class ForgotEmailPage  extends PageObject{
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='https://preprod-dazn.cs86.force.com/contactus/DE-en']")
    @CacheLookup
    private WebElement customerSupport;


    @FindBy(name = "firstName")
    @CacheLookup
    private WebElement forgotEmailpleaseEnterYourDetailsTo1;

    @FindBy(name = "lastName")
    @CacheLookup
    private WebElement forgotEmailpleaseEnterYourDetailsTo2;

    @FindBy(css = "")
    @CacheLookup
    private WebElement getEmail;

    @FindBy(css = "")
    @CacheLookup
    private WebElement last4DigitsOfYourCard1;

    @FindBy(name = "cardNumber")
    @CacheLookup
    private WebElement last4DigitsOfYourCard2;

    private final String pageLoadedText = "";

    private final String pageUrl = "/en-DE/account/remember-email";


    public ForgotEmailPage(WebDriver driver) {
        super(driver);
    }

    public ForgotEmailPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public ForgotEmailPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }


    public ForgotEmailPage clickCustomerSupportLink() {
        customerSupport.click();
        return this;
    }


    public ForgotEmailPage clickGetEmailButton() {
        getEmail.click();
        return this;
    }



    public ForgotEmailPage fill() {
        setForgotEmailpleaseEnterYourDetailsTo1TextField();
        setForgotEmailpleaseEnterYourDetailsTo2TextField();
        setLast4DigitsOfYourCard1NumberField();
        setLast4DigitsOfYourCard2NumberField();
        return this;
    }


    public ForgotEmailPage fillAndSubmit() {
        fill();
        return submit();
    }


    public ForgotEmailPage setForgotEmailpleaseEnterYourDetailsTo1TextField() {
        return setForgotEmailpleaseEnterYourDetailsTo1TextField(data.get("FORGOT_EMAILPLEASE_ENTER_YOUR_DETAILS_TO_1"));
    }


    public ForgotEmailPage setForgotEmailpleaseEnterYourDetailsTo1TextField(String forgotEmailpleaseEnterYourDetailsTo1Value) {
        forgotEmailpleaseEnterYourDetailsTo1.sendKeys(forgotEmailpleaseEnterYourDetailsTo1Value);
        return this;
    }


    public ForgotEmailPage setForgotEmailpleaseEnterYourDetailsTo2TextField() {
        return setForgotEmailpleaseEnterYourDetailsTo2TextField(data.get("FORGOT_EMAILPLEASE_ENTER_YOUR_DETAILS_TO_2"));
    }


    public ForgotEmailPage setForgotEmailpleaseEnterYourDetailsTo2TextField(String forgotEmailpleaseEnterYourDetailsTo2Value) {
        forgotEmailpleaseEnterYourDetailsTo2.sendKeys(forgotEmailpleaseEnterYourDetailsTo2Value);
        return this;
    }

    public ForgotEmailPage setLast4DigitsOfYourCard1NumberField() {
        return setLast4DigitsOfYourCard1NumberField(data.get("LAST_4_DIGITS_OF_YOUR_CARD_1"));
    }


    public ForgotEmailPage setLast4DigitsOfYourCard1NumberField(String last4DigitsOfYourCard1Value) {
        new Select(last4DigitsOfYourCard1).selectByVisibleText(last4DigitsOfYourCard1Value);
        return this;
    }


    public ForgotEmailPage setLast4DigitsOfYourCard2NumberField() {
        return setLast4DigitsOfYourCard2NumberField(data.get("LAST_4_DIGITS_OF_YOUR_CARD_2"));
    }


    public ForgotEmailPage setLast4DigitsOfYourCard2NumberField(String last4DigitsOfYourCard2Value) {
        last4DigitsOfYourCard2.sendKeys(last4DigitsOfYourCard2Value);
        return this;
    }


    public ForgotEmailPage submit() {
        clickGetEmailButton();
        return this;
    }

}
