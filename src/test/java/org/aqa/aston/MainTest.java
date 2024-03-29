package org.aqa.aston;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pageEntity.Mts;
import org.testng.annotations.Test;

import java.util.List;

public class MainTest extends BaseTest {
    @Test
    public void test1() {
        Mts mts = PageFactory.initElements(driver, Mts.class);
        driver.get("https://www.mts.by/");

        String title = mts.checkPaymentBlockTitle();
        Assert.assertEquals(title, "Онлайн пополнение" + "\n" + "без комиссии");

    }

    @Test
    public void test2() {
        Mts mts = PageFactory.initElements(driver, Mts.class);
        driver.get("https://www.mts.by/");
        List<WebElement> partnerLogoList = driver.findElements(By.xpath("//div[@class='pay__partners']"));
        Assert.assertFalse(partnerLogoList.isEmpty());
    }

    @Test
    public void test3() {
        Mts mts = PageFactory.initElements(driver, Mts.class);
        driver.get("https://www.mts.by/");
        mts.cookiesFrameAccepting();
        mts.moreInfoClick();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"));
    }

    @Test
    public void test4() {
        Mts mts = PageFactory.initElements(driver, Mts.class);
        driver.get("https://www.mts.by/");
        mts.phoneNumberFieldClick();
        mts.phoneNumberFieldEntry();
        mts.amountFieldClick();
        mts.amountFieldEntry();
        mts.continueButtonClick();

    }
}
