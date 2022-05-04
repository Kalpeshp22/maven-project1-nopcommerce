package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class NokiaLumia1020 extends Utility {

    By verifyTextNokiaLumia = By.xpath("//h1[normalize-space()='Nokia Lumia 1020']");
    By verifyThePrice = By.xpath("//span[contains(text(),' $349.00 ')]");
    By changeQuantity = By.xpath("//input[@id='product_enteredQuantity_20']");
    By addToCart = By.xpath("//button[@id='add-to-cart-button-20']");
    By verifyCartMessage = By.xpath("//p[contains(.,'The product has been added to your shopping cart')]");
    By closeNotification = By.xpath("//span[@title='Close']");
    By mouseHoverShoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By mouseHoverGoToCart = By.xpath("//button[contains(text(),'Go to cart')]");


    public void textNokiaLumia1020(){
        verifyText("Nokia Lumia 1020",verifyTextNokiaLumia,"Product name not displayed");
    }

    public void verifyPrice(){
        verifyText("$349.00",verifyThePrice,"Error. Price not displayed");
    }

    public void changeQuantityTo2(){
        sendKeysToElement(changeQuantity, Keys.BACK_SPACE);
        sendTextToElement(changeQuantity, "2");
    }

    public void clickAddToCart(){
        clickOnElement(addToCart);
    }

    public void textCartMessage(){
        verifyText("The product has been added to your shopping cart",verifyCartMessage,"Error, Message not displayed");
    }
    public void closeNotificationMessage(){
        clickOnElement(closeNotification);
    }

    public void setMouseHoverToShoppingCart() throws InterruptedException {
        mouseHoverToElementAndClick(mouseHoverShoppingCart);

    }
    public void setMouseHoverToGoToCart() throws InterruptedException {
        mouseHoverToElementAndClick(mouseHoverGoToCart);
    }



}
