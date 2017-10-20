package e2eTestFramework.pages;

import e2eTestFramework.common.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class NewCustomerPaymentPage extends PageObject{
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;


    @FindBy(css = "a[href='/help/DE-en_GB/about']")
    @CacheLookup
    private WebElement about;

    @FindBy(id = "idDDAccountName")
    @CacheLookup
    private WebElement accountName;

    @FindBy(id = "BackToHome")
    @CacheLookup
    private WebElement backToHome;

    @FindBy(css = "#creditCardButton span:nth-of-type(2) a.cancelLink")
    @CacheLookup
    private WebElement cancel1;

    @FindBy(css = "#directDebitButton span:nth-of-type(2) a.cancelLink")
    @CacheLookup
    private WebElement cancel2;

    @FindBy(id = "j_id0:idCPMPage:j_id84:idPPCancelLink")
    @CacheLookup
    private WebElement cancel3;

    @FindBy(id = "idCCCardNumber")
    @CacheLookup
    private WebElement cardNumber;

    @FindBy(id = "j_id0:idCPMPage:j_id84:ContinueToPaypalButton")
    @CacheLookup
    private WebElement continueTo;

    @FindBy(name = "paymentGrp")
    @CacheLookup
    private List<WebElement> creditCard;

    private final String creditCardValue = "on";

    @FindBy(id = "changelang")
    @CacheLookup
    private WebElement deutsch;

    @FindBy(name = "paymentGrp")
    @CacheLookup
    private List<WebElement> directDebit;

    private final String directDebitValue = "on";

    @FindBy(css = "a[href='/help/DE-en_GB/FAQ']")
    @CacheLookup
    private WebElement faq;

    @FindBy(css = "a[href='/help/DE-en_GB']")
    @CacheLookup
    private WebElement help;

    @FindBy(id = "idDDAccountNumber")
    @CacheLookup
    private WebElement iban;

    @FindBy(css = "a[href='http://media.dazn.com/']")
    @CacheLookup
    private WebElement media;

    @FindBy(css = "button[title='Month']")
    @CacheLookup
    private WebElement month;

    @FindBy(id = "BackToMyAccount")
    @CacheLookup
    private WebElement myAccount;

    @FindBy(id = "idCCHolderName")
    @CacheLookup
    private WebElement nameOnCard;

    private final String pageLoadedText = "By clicking the \"SAVE\" button, you acknowledge that you have read and agree to the";

    private final String pageUrl = "/ChangePaymentMethodPage";

    @FindBy(name = "paymentGrp")
    @CacheLookup
    private List<WebElement> paypal;

    private final String paypalValue = "on";

    @FindBy(css = "#j_id0:idCPMPage:j_id41 div:nth-of-type(1) div.col-xs-12.col-sm-12.col-md-12.col-lg-12.padding0. div:nth-of-type(6) span.CPMCreditCardNote a:nth-of-type(2)")
    @CacheLookup
    private WebElement privacyPolicy1;

    @FindBy(css = "#j_id0:idCPMPage:j_id66 div:nth-of-type(1) div.col-xs-12.col-sm-12.col-md-12.col-lg-12.padding0 div:nth-of-type(3) span.CPMDirectDebitNote a:nth-of-type(2)")
    @CacheLookup
    private WebElement privacyPolicy2;

    @FindBy(css = "#pageFooter div:nth-of-type(1) div:nth-of-type(1) ul span:nth-of-type(2) li:nth-of-type(2) a")
    @CacheLookup
    private WebElement privacyPolicy3;

    @FindBy(id = "theSaveCCChanges")
    @CacheLookup
    private WebElement save1;

    @FindBy(id = "theSaveDDChanges")
    @CacheLookup
    private WebElement save2;

    @FindBy(id = "idCCMonth")
    @CacheLookup
    private WebElement securityCode1;

    @FindBy(id = "idCCYear")
    @CacheLookup
    private WebElement securityCode2;

    @FindBy(id = "idCCCVC")
    @CacheLookup
    private WebElement securityCode3;

    @FindBy(css = "#pageFooter div:nth-of-type(1) div:nth-of-type(1) ul span:nth-of-type(2) li:nth-of-type(1) a")
    @CacheLookup
    private WebElement termsOfUse;

    @FindBy(css = "#j_id0:idCPMPage:j_id41 div:nth-of-type(1) div.col-xs-12.col-sm-12.col-md-12.col-lg-12.padding0. div:nth-of-type(6) span.CPMCreditCardNote a:nth-of-type(1)")
    @CacheLookup
    private WebElement termsOfUse1;

    @FindBy(css = "#j_id0:idCPMPage:j_id66 div:nth-of-type(1) div.col-xs-12.col-sm-12.col-md-12.col-lg-12.padding0 div:nth-of-type(3) span.CPMDirectDebitNote a:nth-of-type(1)")
    @CacheLookup
    private WebElement termsOfUse2;

    @FindBy(css = "button[title='Year']")
    @CacheLookup
    private WebElement year;


    public NewCustomerPaymentPage(WebDriver driver) {
        super(driver);
    }


    public NewCustomerPaymentPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public NewCustomerPaymentPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    public NewCustomerPaymentPage clickAboutLink() {
        about.click();
        return this;
    }

    public NewCustomerPaymentPage clickBackToHomeLink() {
        backToHome.click();
        return this;
    }

    public NewCustomerPaymentPage clickCancel1Link() {
        cancel1.click();
        return this;
    }

    public NewCustomerPaymentPage clickCancel2Link() {
        cancel2.click();
        return this;
    }

    public NewCustomerPaymentPage clickCancel3Link() {
        cancel3.click();
        return this;
    }

    public NewCustomerPaymentPage clickContinueToLink() {
        continueTo.click();
        return this;
    }

    public NewCustomerPaymentPage clickDeutschLink() {
        deutsch.click();
        return this;
    }

    public NewCustomerPaymentPage clickMediaLink() {
        media.click();
        return this;
    }

    public NewCustomerPaymentPage clickMonthButton() {
        month.click();
        return this;
    }

    public NewCustomerPaymentPage clickMyAccountLink() {
        myAccount.click();
        return this;
    }

    public NewCustomerPaymentPage clickPrivacyPolicy1Link() {
        privacyPolicy1.click();
        return this;
    }

    public NewCustomerPaymentPage clickPrivacyPolicy2Link() {
        privacyPolicy2.click();
        return this;
    }

    public NewCustomerPaymentPage clickPrivacyPolicy3Link() {
        privacyPolicy3.click();
        return this;
    }

    public NewCustomerPaymentPage clickSave1Button() {
        save1.click();
        return this;
    }

    public NewCustomerPaymentPage clickSave2Button() {
        save2.click();
        return this;
    }


    public NewCustomerPaymentPage clickTermsOfUse1Link() {
        termsOfUse1.click();
        return this;
    }

    public NewCustomerPaymentPage clickTermsOfUse2Link() {
        termsOfUse2.click();
        return this;
    }

    public NewCustomerPaymentPage clickTermsOfUseLink() {
        termsOfUse.click();
        return this;
    }

    public NewCustomerPaymentPage clickYearButton() {
        year.click();
        return this;
    }

    public NewCustomerPaymentPage fill() {
        setDirectDebitRadioButtonField();
        setCreditCardRadioButtonField();
        setPaypalRadioButtonField();
        setNameOnCardTextField();
        setCardNumberTextField();
        setSecurityCode1DropDownListField();
        setSecurityCode2DropDownListField();
        setSecurityCode3TextField();
        setAccountNameTextField();
        setIbanTextField();
        return this;
    }


    public NewCustomerPaymentPage fillAndSubmit() {
        fill();
        return submit();
    }


    public NewCustomerPaymentPage setAccountNameTextField() {
        return setAccountNameTextField(data.get("ACCOUNT_NAME"));
    }


    public NewCustomerPaymentPage setAccountNameTextField(String accountNameValue) {
        accountName.sendKeys(accountNameValue);
        return this;
    }


    public NewCustomerPaymentPage setCardNumberTextField() {
        return setCardNumberTextField(data.get("CARD_NUMBER"));
    }


    public NewCustomerPaymentPage setCardNumberTextField(String cardNumberValue) {
        cardNumber.sendKeys(cardNumberValue);
        return this;
    }


    public NewCustomerPaymentPage setCreditCardRadioButtonField() {
        for (WebElement el : creditCard) {
            if (el.getAttribute("value").equals(creditCardValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }


    public NewCustomerPaymentPage setDirectDebitRadioButtonField() {
        for (WebElement el : directDebit) {
            if (el.getAttribute("value").equals(directDebitValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    public NewCustomerPaymentPage setIbanTextField() {
        return setIbanTextField(data.get("IBAN"));
    }


    public NewCustomerPaymentPage setIbanTextField(String ibanValue) {
        iban.sendKeys(ibanValue);
        return this;
    }


    public NewCustomerPaymentPage setNameOnCardTextField() {
        return setNameOnCardTextField(data.get("NAME_ON_CARD"));
    }

    public NewCustomerPaymentPage setNameOnCardTextField(String nameOnCardValue) {
        nameOnCard.sendKeys(nameOnCardValue);
        return this;
    }


    public NewCustomerPaymentPage setPaypalRadioButtonField() {
        for (WebElement el : paypal) {
            if (el.getAttribute("value").equals(paypalValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }


    public NewCustomerPaymentPage setSecurityCode1DropDownListField() {
        return setSecurityCode1DropDownListField(data.get("SECURITY_CODE_1"));
    }


    public NewCustomerPaymentPage setSecurityCode1DropDownListField(String securityCode1Value) {
        new Select(securityCode1).selectByVisibleText(securityCode1Value);
        return this;
    }


    public NewCustomerPaymentPage setSecurityCode2DropDownListField() {
        return setSecurityCode2DropDownListField(data.get("SECURITY_CODE_2"));
    }


    public NewCustomerPaymentPage setSecurityCode2DropDownListField(String securityCode2Value) {
        new Select(securityCode2).selectByVisibleText(securityCode2Value);
        return this;
    }


    public NewCustomerPaymentPage setSecurityCode3TextField() {
        return setSecurityCode3TextField(data.get("SECURITY_CODE_3"));
    }


    public NewCustomerPaymentPage setSecurityCode3TextField(String securityCode3Value) {
        securityCode3.sendKeys(securityCode3Value);
        return this;
    }


    public NewCustomerPaymentPage submit() {
//        clickSaveButton();
        return this;
    }


    public NewCustomerPaymentPage unsetSecurityCode1DropDownListField() {
        return unsetSecurityCode1DropDownListField(data.get("SECURITY_CODE_1"));
    }


    public NewCustomerPaymentPage unsetSecurityCode1DropDownListField(String securityCode1Value) {
        new Select(securityCode1).deselectByVisibleText(securityCode1Value);
        return this;
    }


    public NewCustomerPaymentPage unsetSecurityCode2DropDownListField() {
        return unsetSecurityCode2DropDownListField(data.get("SECURITY_CODE_2"));
    }


    public NewCustomerPaymentPage unsetSecurityCode2DropDownListField(String securityCode2Value) {
        new Select(securityCode2).deselectByVisibleText(securityCode2Value);
        return this;
    }

}