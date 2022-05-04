package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerTest extends TestBase {
    HomePage homePage = new HomePage();
    BuildYourOwnComputerPage buildPage = new BuildYourOwnComputerPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    LoginPage loginPage = new LoginPage();
    CheckOutPage checkOutPage = new CheckOutPage();

    @Test
    public void userShouldBeAbleToBuildAndBuyDesktop() throws InterruptedException {

        /*
         * MAKE SURE TO REGISTER WITH THE FOLLOWING CREDENTIALS
         * FIRST NAME: Prime
         * LAST NAME: Testing
         * DOB: input date of birth of choice
         * EMAIL: prime123@testing.com
         * PASSWORD & CONFIRMPASSWORD: prime123
         * */

        homePage.clickOnLoginLink();

        clickOnElement(homePage.menuComputers);
        clickOnElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a"));
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]"));

        buildPage.insertSpecs();
        buildPage.clickAddToCartButton();

        Assert.assertEquals("The product has been added to your shopping cart", getTextFromElement(By.xpath("//*[@id='bar-notification']/div/p")));

        clickOnElement(By.xpath("//body[1]/div[5]/div[1]/p[1]/a[1]"));

        shoppingCartPage.agreeAndCheckout();

        clickOnElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]"));

        checkOutPage.inputDetails();
        checkOutPage.inputShipping();
        checkOutPage.setPaymentMethod();
        checkOutPage.setPaymentInfo();

        String actual = getTextFromElement(By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/strong[1]"));
        Assert.assertEquals(actual, "Your order has been successfully processed!", "longshot");
    }
}
