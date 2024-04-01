package pageEntity;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Mts {
    @FindBy(xpath = "//div[@class='page-header-links']//a[contains(text(), 'Интернет-магазин')]")
    private WebElement menu;

//    @FindBy(xpath = "//iframe[@class='bepaid-iframe']")
//    private WebElement paymentForm;

    @FindBy(xpath = "//button[text()='Принять']")
    private WebElement buttonAgree;

    @FindBy(xpath = "//button[@class='select__header']")
    private WebElement paymentFormSelectHeader;

    @FindBy(xpath = "//p[text()='Услуги связи']")
    private WebElement service;

    @FindBy(xpath = "//p[text()='Домашний интернет']")
    private WebElement homeInternet;

    @FindBy(xpath = "//p[text()='Рассрочка']")
    private WebElement installment;

    @FindBy(xpath = "//p[text()='Задолженность']")
    private WebElement arrears;

    @FindBy(xpath = "//input[@placeholder='Номер телефона']")
    private WebElement phoneNumberField;

    @FindBy(xpath = "//input[@id='internet-phone']")
    private WebElement internetPhoneNumberField;

    @FindBy(xpath = "//input[@id='score-instalment']")
    private WebElement scoreInstalmentField;

    @FindBy(xpath = "//input[@id='score-arrears']")
    private WebElement scoreArrearsField;

    @FindBy(xpath = "//input[@id='connection-sum']")
    private WebElement amountField;

    @FindBy(xpath = "//input[@id='internet-sum']")
    private WebElement internetAmountField;

    @FindBy(xpath = "//input[@id='instalment-sum']")
    private WebElement installmentAmountField;

    @FindBy(xpath = "//input[@id='arrears-sum']")
    private WebElement arrearsAmountField;

    @FindBy(xpath = "//input[@id='connection-email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='internet-email']")
    private WebElement internetEmailField;

    @FindBy(xpath = "//input[@id='instalment-email']")
    private WebElement installmentEmailField;

    @FindBy(xpath = "//input[@id='arrears-email']")
    private WebElement arrearsEmailField;

    @FindBy(xpath = "//form[@class='pay-form opened']//button")
    private WebElement continueButton;

    @FindBy(xpath = "//div[@class='back-container payment-page']")
    private WebElement paymentWindow;

    public void cookiesFrameAccepting() {
        if (buttonAgree.isDisplayed()) {
            buttonAgree.click();
        }
    }

    public void openDropdownMenu() {
        paymentFormSelectHeader.click();
    }

    public void checkServicePlaceholders() {
        openDropdownMenu();
        service.click();
        Assert.assertEquals(phoneNumberField.getAttribute("placeholder"), "Номер телефона");
        Assert.assertEquals(amountField.getAttribute("placeholder"), "Сумма");
        Assert.assertEquals(emailField.getAttribute("placeholder"), "E-mail для отправки чека");
    }

    public void checkHomeInternetPlaceholders() {
        openDropdownMenu();
        homeInternet.click();
        Assert.assertEquals(internetPhoneNumberField.getAttribute("placeholder"), "Номер абонента");
        Assert.assertEquals(internetAmountField.getAttribute("placeholder"), "Сумма");
        Assert.assertEquals(internetEmailField.getAttribute("placeholder"), "E-mail для отправки чека");
    }

    public void checkInstalmentPlaceholders() {
        openDropdownMenu();
        installment.click();
        Assert.assertEquals(scoreInstalmentField.getAttribute("placeholder"), "Номер счета на 44");
        Assert.assertEquals(installmentAmountField.getAttribute("placeholder"), "Сумма");
        Assert.assertEquals(installmentEmailField.getAttribute("placeholder"), "E-mail для отправки чека");
    }

    public void checkArrearsPlaceholders() {
        openDropdownMenu();
        arrears.click();
        Assert.assertEquals(scoreArrearsField.getAttribute("placeholder"), "Номер счета на 2073");
        Assert.assertEquals(arrearsAmountField.getAttribute("placeholder"), "Сумма");
        Assert.assertEquals(arrearsEmailField.getAttribute("placeholder"), "E-mail для отправки чека");
    }

    public void serviceFieldsFilling() {
        openDropdownMenu();
        service.click();
        phoneNumberField.sendKeys("297777777");
        amountField.sendKeys("50");
    }

    public void continueButtonClick() {
        continueButton.click();
    }
}


