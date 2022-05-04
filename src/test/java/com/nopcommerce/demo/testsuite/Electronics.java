package com.nopcommerce.demo.testsuite;
import java.util.concurrent.ThreadLocalRandom;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Electronics extends TestBase {

    HomePage homePage = new HomePage();
    CellPhonePage cellPhonesPage = new CellPhonePage();
    NokiaLumia1020 nokiaLumia1020 = new NokiaLumia1020();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    LoginPage signInPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    CellPhonePage cellPhonePage = new CellPhonePage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully(){
        homePage.hoverAndClickElectronics();
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        homePage.hoverAndClickElectronics();

        cellPhonesPage.clickListViewTab();
        cellPhonesPage.clickNokiaLumia();
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]")), "Nokia Lumia 1020");
        Assert.assertEquals(getTextFromElement(By.xpath("//body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[6]/div[1]/span[1]")), "$349.00");

        nokiaLumia1020.changeQuantityTo2();
        nokiaLumia1020.clickAddToCart();
        nokiaLumia1020.textCartMessage();
        clickOnElement(By.xpath("//body[1]/div[5]/div[1]/p[1]/a[1]"));

        Assert.assertEquals(driver.findElement(By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/input[1]")).getAttribute("value"), "2");
        verifyText("$698.00", By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]"), "The prices do not match");
        clickOnElement(By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[4]/button[1]"));

        shoppingCartPage.agreeAndCheckout();

        clickOnElement(By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/button[2]"));

        registerPage.enterGender();
        registerPage.enterFirstName("kalpesh");
        registerPage.enterLastName("panchal");
        registerPage.enterDateOfBirth("13", "January", "2001");
        registerPage.enterEmail("asde@prime" + ThreadLocalRandom.current().nextInt(0, 1000000000 + 1) + ".com");
        registerPage.enterPassword("paspas");
        registerPage.enterConfirmPassword("paspas");
        registerPage.clickRegisterButton();

        String actual = getTextFromElement(By.className("result"));
        String expected = "Your registration completed";

        Assert.assertEquals(expected, actual);

        clickOnElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]/a"));

        shoppingCartPage.agreeAndCheckout();

        checkOutPage.inputDetailsLoggedIn();
        checkOutPage.inputShipping();
        checkOutPage.setPaymentMethod();
        checkOutPage.setPaymentInfo();

        Thread.sleep(4000);

        verifyText("Thank you", By.xpath("/html/body/div[6]/div[3]/div/div/div/div[1]"), "PROBLEM with Thank you");
        verifyText("Your order has been successfully processed!", By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]"), "PROBLEM with order confirm message");
        clickOnElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[3]/button"));

        verifyText("Welcome to our store", By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[2]/div[1]"), "title is wrong");
        clickOnElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));

        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/");

    }

 }
