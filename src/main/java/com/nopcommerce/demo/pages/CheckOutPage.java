package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {
    
    public By shippingNextDay = By.id("shippingoption_1");

    public By radioPaymentMethod = By.id("paymentmethod_1");

    public By inputHolderName = By.id("CardholderName");
    public By inputCardNumber = By.id("CardNumber");
    public By dropdownExipreYear = By.id("ExpireYear");
    public By cardCode = By.id("CardCode");

    public void inputDetails(){
        sendTextToElement(By.xpath("//*[@id='BillingNewAddress_FirstName']"), "Kalpesh");
        sendTextToElement(By.xpath("//*[@id='BillingNewAddress_LastName']"), "Patel");
        sendTextToElement(By.xpath("//*[@id='BillingNewAddress_Email']"), "prime123@testing.com");
        selectByContainsTextFromDropDown(By.xpath("//*[@id='BillingNewAddress_CountryId']"), "United Kingdom");
        sendTextToElement(By.xpath("//*[@id='BillingNewAddress_City']"), "London");
        sendTextToElement(By.xpath("//*[@id='BillingNewAddress_Address1']"), "123 Brut Avenue");
        sendTextToElement(By.xpath("//*[@id='BillingNewAddress_ZipPostalCode']"), "456315");
        sendTextToElement(By.xpath("//*[@id='BillingNewAddress_PhoneNumber']"), "12345678910");

        clickOnElement(By.xpath("//*[@id='billing-buttons-container']/button[4]"));
    }

    public void inputDetailsLoggedIn(){
        selectByContainsTextFromDropDown(By.xpath("//*[@id='BillingNewAddress_CountryId']"), "United Kingdom");
        sendTextToElement(By.xpath("//*[@id='BillingNewAddress_City']"), "London");
        sendTextToElement(By.xpath("//*[@id='BillingNewAddress_Address1']"), "123 Brut Avenue");
        sendTextToElement(By.xpath("//*[@id='BillingNewAddress_ZipPostalCode']"), "456315");
        sendTextToElement(By.xpath("//*[@id='BillingNewAddress_PhoneNumber']"), "12345678910");

        clickOnElement(By.xpath("//*[@id='billing-buttons-container']/button[4]"));
    }

    public void inputShipping(){
        clickOnElement(shippingNextDay);
        clickOnElement(By.xpath("//*[@id='shipping-method-buttons-container']/button"));
    }

    public void setPaymentMethod(){
        clickOnElement(radioPaymentMethod);
        clickOnElement(By.xpath("//*[@id='payment-method-buttons-container']/button"));
    }

    public void setPaymentInfo() throws InterruptedException {
        sendTextToElement(inputHolderName, "Kalpesh");
        sendTextToElement(inputCardNumber, "4111111111111111");
        selectByIndexFromDropDown(dropdownExipreYear, 9);
        sendTextToElement(cardCode, "5463");
        clickOnElement(By.xpath("//*[@id='payment-info-buttons-container']/button"));
        Thread.sleep(2000);

        clickOnElement(By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[2]/button[1]"));
    }


}
