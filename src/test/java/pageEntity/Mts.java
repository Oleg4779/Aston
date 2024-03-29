package pageEntity;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mts {
    @FindBy(xpath = "//div[@class='page-header-links']//a[contains(text(), 'Интернет-магазин')]")
    private WebElement menu;

    @FindBy(xpath = "//button[text()='Принять']")
    private WebElement buttonAgree;

    @FindBy(xpath = "//h2[text()='Онлайн пополнение ']")
    private WebElement paymentBlockTitle;

    @FindBy(xpath = "//div[@class='pay__partners']")
    private WebElement partnerLogo;

    @FindBy(xpath = "//section[@class='pay']//a")
    private WebElement moreInfoLink;

    @FindBy(xpath = "//div[@class='select__wrapper']")
    private WebElement paymentFormSelectWrapper;

    @FindBy(xpath = "//input[@placeholder='Номер телефона']")
    private WebElement phoneNumber;

    @FindBy(xpath = "//input[@placeholder='Сумма']")
    private WebElement amountField;

    @FindBy(xpath = "//form[@class='pay-form opened']//button")
    private WebElement continueButton;

    public void cookiesFrameAccepting() {
        if(buttonAgree.isDisplayed()) {
            buttonAgree.click();
        }
    }

    public String checkPaymentBlockTitle() {
        return paymentBlockTitle.getText();
    }

    public void moreInfoClick() {
        moreInfoLink.click();
    }

    public void phoneNumberFieldClick() {
        phoneNumber.click();
    }

    public void phoneNumberFieldEntry() {
        phoneNumber.sendKeys("297777777");
    }

    public void amountFieldClick() {
        amountField.click();
    }

    public void amountFieldEntry() {
        amountField.sendKeys("50");
    }

    public void continueButtonClick() {
        continueButton.click();
    }
}
