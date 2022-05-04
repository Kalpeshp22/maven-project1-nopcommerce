package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class ShoppingCartPage extends Utility {
    public By termsAndAgreements = By.id("termsofservice");
    public By buttonCheckout = By.id("checkout");
    public By quantity = By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/input[1]");

    public void agreeAndCheckout(){
        sendKeysToElement(quantity, Keys.BACK_SPACE);
        sendTextToElement(quantity, "2");
        sendKeysToElement(quantity, Keys.ENTER);
        clickOnElement(termsAndAgreements);
        clickOnElement(buttonCheckout);
    }


}
