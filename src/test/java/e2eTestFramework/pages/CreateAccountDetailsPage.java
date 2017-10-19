package e2eTestFramework.pages;

import e2eTestFramework.common.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

public class CreateAccountDetailsPage extends PageObject{
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    private final String CONTINUE_BUTTON = "button.Button.SubmitButton.primary.enabled.centerBtn";
    public static final String FIRST_NAME = "button.Button.SubmitButton.primary.enabled.centerBtn";
    public static final String LAST_NAME_ELEMENT = "button.Button.SubmitButton.primary.enabled.centerBtn";
    public static final String EMAIL_ELEMENT = "button.Button.SubmitButton.primary.enabled.centerBtn";
    public static final String PASSWORD_ELEMENT = "button.Button.SubmitButton.primary.enabled.centerBtn";
    public static final String REPEAT_PASSWORD_ELEMENT = "button.Button.SubmitButton.primary.enabled.centerBtn";
    public static final String SIGN_IN_LINK = "a[href='/account/signin']";
    public static final String MARKETING_CHECKBOX = "#app div.Root.layout5.castConnectionStatus-noDevicesAvailable div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(2) form fieldset div:nth-of-type(4) div.Checkbox input[type='checkbox']";

    private final String pageLoadedText = "Your free month trial starts today. From 18.11.2017, pay 9.99 EUR per month. Your subscription is cancellable monthly.";
    private final String pageUrl = "/en-DE/account/signup";


    @FindBy(css = CONTINUE_BUTTON)
    @CacheLookup
    private WebElement continue_Button;

    @FindBy(name = FIRST_NAME)
    @CacheLookup
    private WebElement enter_firstname;

    @FindBy(name = LAST_NAME_ELEMENT)
    @CacheLookup
    private WebElement enter_lastname;

    @FindBy(name = EMAIL_ELEMENT)
    @CacheLookup
    private WebElement enter_email;

    @FindBy(name = PASSWORD_ELEMENT)
    @CacheLookup
    private WebElement enter_password;

    @FindBy(name = REPEAT_PASSWORD_ELEMENT)
    @CacheLookup
    private WebElement enter_repeat_password;

    @FindBy(css = MARKETING_CHECKBOX)
    @CacheLookup
    private WebElement marketing_checkbox;

    @FindBy(css = SIGN_IN_LINK)
    @CacheLookup
    private WebElement signInLink;

    public CreateAccountDetailsPage(WebDriver driver) {
        super(driver);
    }


    public CreateAccountDetailsPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public CreateAccountDetailsPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }


    public CreateAccountDetailsPage clickContinueButton() {
        continue_Button.click();
        return this;
    }


    public CreateAccountDetailsPage fillinPaymentDetails(String firstname, String lastname, String email, String password, String secondpassword) {
        enterFirstName(firstname);
        enterLastName(lastname);
        enterEmail(email);
        enterPassword(password);
        enterSecondPassword(secondpassword);
//        checkMarketingCheckBox();
        return this;
    }


    public CreateAccountDetailsPage fillAndSubmit(String firstname, String lastname, String email, String password, String secondpassword) {
        {
            fillinPaymentDetails(firstname, lastname, email, password, secondpassword);
            return submit();
        }
    }

    public CreateAccountDetailsPage enterFirstName(String firstName) {
        enter_firstname.sendKeys(firstName);
        return this;
    }


    public CreateAccountDetailsPage enterLastName(String lastName) {
        enter_lastname.sendKeys(lastName);
        return this;
    }


    public CreateAccountDetailsPage enterEmail(String myEmail) {
        enter_email.sendKeys(myEmail);

        return this;
    }


    public CreateAccountDetailsPage enterPassword(String passwordValue) {
        enter_password.sendKeys(passwordValue);
        return this;
    }


    public CreateAccountDetailsPage enterSecondPassword(String secondPasswordValue) {
        enter_repeat_password.sendKeys(secondPasswordValue);
        return this;
    }


    public CreateAccountDetailsPage selectMarketingEmailCheckBox() {
        if (!marketing_checkbox.isSelected()) {
            marketing_checkbox.click();
        }
        return this;
    }

    public CreateAccountDetailsPage unSelectmarketingEmailCheckBox() {
        if (marketing_checkbox.isSelected()) {
            marketing_checkbox.click();
        }
        return this;
    }

    public CreateAccountDetailsPage submit() {
        clickContinueButton();
        return this;
    }

}