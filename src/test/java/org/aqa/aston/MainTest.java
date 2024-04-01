package org.aqa.aston;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageEntity.Mts;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class MainTest extends BaseTest {
    @Test
    public void test1() {
        Mts mts = PageFactory.initElements(driver, Mts.class);
        driver.get("https://www.mts.by/");

        mts.cookiesFrameAccepting();

        mts.checkServicePlaceholders();
        mts.checkHomeInternetPlaceholders();
        mts.checkInstalmentPlaceholders();
        mts.checkArrearsPlaceholders();
    }

    @Test
    public void test2() throws InterruptedException {
        Mts mts = PageFactory.initElements(driver, Mts.class);
        driver.get("https://www.mts.by");

        mts.cookiesFrameAccepting();
        mts.serviceFieldsFilling();
        mts.continueButtonClick();
        Thread.sleep(10000);
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='bepaid-iframe']"));
        driver.switchTo().frame(iframe);
        WebElement amount = driver.findElement(By.xpath("//div[@class='header__payment-amount']"));
        Assert.assertTrue(amount.getText().contains("50.00 BYN"));
        WebElement phoneNumber = driver.findElement(By.xpath("//p[@class='header__payment-info']"));
        Assert.assertTrue(phoneNumber.getText().contains("375297777777"));
        WebElement payButton = driver.findElement(By.xpath("//button[@class='colored disabled ng-star-inserted']"));
        Assert.assertTrue(payButton.getText().contains("50.00 BYN"));
        WebElement cardNumber = driver.findElement(By.xpath("//label[contains(text(),'Номер карты')]"));
        WebElement cardDuration = driver.findElement(By.xpath("//label[contains(text(),'Срок действия')]"));
        WebElement cvc = driver.findElement(By.xpath("//label[contains(text(),'CVC')]"));
        WebElement cardOwnerName = driver.findElement(By.xpath("//label[contains(text(),'Имя держателя (как на карте)')]"));
        Assert.assertEquals(cardNumber.getText(), "Номер карты");
        Assert.assertEquals(cardDuration.getText(), "Срок действия");
        Assert.assertEquals(cvc.getText(), "CVC");
        Assert.assertEquals(cardOwnerName.getText(), "Имя держателя (как на карте)");
        List<WebElement> cardBrands = driver.findElements(By.xpath("//div[@class='cards-brands cards-brands__container ng-tns-c55-0 ng-trigger ng-trigger-brandsState ng-star-inserted']"));
        Assert.assertFalse(cardBrands.isEmpty());
    }
}
