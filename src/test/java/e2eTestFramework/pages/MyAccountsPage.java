package e2eTestFramework.pages;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountsPage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(id = "BackToHome")
    @CacheLookup
    private WebElement backToHome;

    @FindBy(id = "j_id0:frmMyAccount:j_id167")
    @CacheLookup
    private WebElement cancelSubscription;

    @FindBy(id = "j_id0:frmMyAccount:PasswordChange")
    @CacheLookup
    private WebElement change1;

    @FindBy(css = "a[href='ChangePaymentMethod']")
    @CacheLookup
    private WebElement change2;

    @FindBy(css = "#j_id0:frmMyAccount:theRepeat:0:j_id206 a.custStyleBtn1")
    @CacheLookup
    private WebElement deregisterDevice1;

    @FindBy(css = "#j_id0:frmMyAccount:theRepeat:1:j_id206 a.custStyleBtn1")
    @CacheLookup
    private WebElement deregisterDevice2;

    @FindBy(css = "#j_id0:frmMyAccount:theRepeat:2:j_id206 a.custStyleBtn1")
    @CacheLookup
    private WebElement deregisterDevice3;

    @FindBy(name = "LanguageGrp")
    @CacheLookup
    private List<WebElement> deutsch;

    private final String deutschValue = "de";

    @FindBy(id = "j_id0:frmMyAccount:editName")
    @CacheLookup
    private WebElement edit1;

    @FindBy(id = "j_id0:frmMyAccount:emailEdit")
    @CacheLookup
    private WebElement edit2;

    @FindBy(name = "LanguageGrp")
    @CacheLookup
    private List<WebElement> english;

    private final String englishValue = "en_gb";

    @FindBy(css = "a[title='https://tinyurl.com/EN-DAZN']")
    @CacheLookup
    private WebElement httpstinyurlComendazn;

    @FindBy(css = "a[href='/help/DE-en/imprint']")
    @CacheLookup
    private WebElement imprint;

    @FindBy(css = "a.learn-more")
    @CacheLookup
    private WebElement learnMore;

    @FindBy(css = "a[href='http://media.dazn.com/']")
    @CacheLookup
    private WebElement media;

    @FindBy(id = "BackToMyAccount")
    @CacheLookup
    private WebElement myAccount;

    @FindBy(css = "a.btn.txtUpperCase.custStyleBtn.wrapper.closeBtn.desktop")
    @CacheLookup
    private WebElement ok;

    @FindBy(css = "a[href='mailto:ozgultestde@gmail.com']")
    @CacheLookup
    private WebElement ozgultestdegmailCom;

    private final String pageLoadedText = "";

    private final String pageUrl = "/myaccount";

    @FindBy(css = "a[href='paymenthistory']")
    @CacheLookup
    private WebElement paymentHistory;


    @FindBy(id = "j_id0:frmMyAccount:idSaveLanguageBtn")
    @CacheLookup
    private WebElement saveLanguage;

    @FindBy(name = "j_id0:frmMyAccount:j_id229")
    @CacheLookup
    private WebElement sendMeExclusiveContentNews;

    @FindBy(id = "j_id0:frmMyAccount:ConfirmDevicesSignOut")
    @CacheLookup
    private WebElement signOutFromAllDevices;


    @FindBy(id = "j_id0:frmMyAccount:j_id213")
    @CacheLookup
    private WebElement viewMore3;

    @FindBy(css = "a.closeBtn.mobile")
    @CacheLookup
    private WebElement x;

    public MyAccountsPage() {
    }

    public MyAccountsPage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public MyAccountsPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public MyAccountsPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }


    public MyAccountsPage clickBackToHomeLink() {
        backToHome.click();
        return this;
    }

    public MyAccountsPage clickCancelSubscriptionLink() {
        cancelSubscription.click();
        return this;
    }


    public MyAccountsPage clickChange1Link() {
        change1.click();
        return this;
    }


    public MyAccountsPage clickChange2Link() {
        change2.click();
        return this;
    }


    public MyAccountsPage clickDeregisterDevice1Link() {
        deregisterDevice1.click();
        return this;
    }


    public MyAccountsPage clickDeregisterDevice2Link() {
        deregisterDevice2.click();
        return this;
    }


    public MyAccountsPage clickDeregisterDevice3Link() {
        deregisterDevice3.click();
        return this;
    }


    public MyAccountsPage clickEdit1Link() {
        edit1.click();
        return this;
    }

    public MyAccountsPage clickEdit2Link() {
        edit2.click();
        return this;
    }

    public MyAccountsPage clickHttpstinyurlComendaznLink() {
        httpstinyurlComendazn.click();
        return this;
    }

    public MyAccountsPage clickImprintLink() {
        imprint.click();
        return this;
    }

    public MyAccountsPage clickLearnMoreLink() {
        learnMore.click();
        return this;
    }

    public MyAccountsPage clickMediaLink() {
        media.click();
        return this;
    }

    public MyAccountsPage clickMyAccountLink() {
        myAccount.click();
        return this;
    }

    public MyAccountsPage clickOkLink() {
        ok.click();
        return this;
    }

    public MyAccountsPage clickOzgultestdegmailComLink() {
        ozgultestdegmailCom.click();
        return this;
    }

    public MyAccountsPage clickPaymentHistoryLink() {
        paymentHistory.click();
        return this;
    }

    public MyAccountsPage clickSaveLanguageLink() {
        saveLanguage.click();
        return this;
    }

    public MyAccountsPage clickSignOutFromAllDevicesLink() {
        signOutFromAllDevices.click();
        return this;
    }

    public MyAccountsPage clickViewMore3Link() {
        viewMore3.click();
        return this;
    }

    public MyAccountsPage fill() {
        setEnglishRadioButtonField();
        setDeutschRadioButtonField();
        setSendMeExclusiveContentNewsCheckboxField();
        return this;
    }


    public MyAccountsPage setDeutschRadioButtonField() {
        for (WebElement el : deutsch) {
            if (el.getAttribute("value").equals(deutschValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }


    public MyAccountsPage setEnglishRadioButtonField() {
        for (WebElement el : english) {
            if (el.getAttribute("value").equals(englishValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }


    public MyAccountsPage setSendMeExclusiveContentNewsCheckboxField() {
        if (!sendMeExclusiveContentNews.isSelected()) {
            sendMeExclusiveContentNews.click();
        }
        return this;
    }


    public MyAccountsPage unsetSendMeExclusiveContentNewsCheckboxField() {
        if (sendMeExclusiveContentNews.isSelected()) {
            sendMeExclusiveContentNews.click();
        }
        return this;
    }
}
