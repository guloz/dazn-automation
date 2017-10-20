package e2eTestFramework.pages;

import e2eTestFramework.common.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Map;

public class MyAccountsPage  extends PageObject {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(id = "BackToHome")
    @CacheLookup
    private WebElement backToHome;

    @FindBy(id = "")
    @CacheLookup
    private WebElement cancelSubscription;

    @FindBy(id = "")
    @CacheLookup
    private WebElement change1;

    @FindBy(css = "")
    @CacheLookup
    private WebElement change2;

    @FindBy(css = "")
    @CacheLookup
    private WebElement deregisterDevice1;

    @FindBy(css = "")
    @CacheLookup
    private WebElement deregisterDevice2;

    @FindBy(css = "")
    @CacheLookup
    private WebElement deregisterDevice3;

    @FindBy(name = "LanguageGrp")
    @CacheLookup
    private List<WebElement> deutsch;

    private final String deutschValue = "de";

    @FindBy(id = "")
    @CacheLookup
    private WebElement edit1;

    @FindBy(id = "")
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

    @FindBy(css = "")
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


    @FindBy(id = "")
    @CacheLookup
    private WebElement saveLanguage;

    @FindBy(name = "")
    @CacheLookup
    private WebElement sendMeExclusiveContentNews;

    @FindBy(id = "")
    @CacheLookup
    private WebElement signOutFromAllDevices;

    public MyAccountsPage(WebDriver driver) {
        super(driver);
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
