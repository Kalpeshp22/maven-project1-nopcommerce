package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
    RegisterPage registerPage = new RegisterPage();
    HomePage homePage = new HomePage();

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        homePage.clickOnRegisterLink();

        registerPage.enterGender();
        registerPage.enterFirstName("kalpesh");
        registerPage.enterLastName("panchal");
        registerPage.enterDateOfBirth("12", "January", "2001");
        registerPage.enterEmail("asde@prime.com");
        registerPage.enterPassword("paspas");
        registerPage.enterConfirmPassword("paspas");
        registerPage.clickRegisterButton();

        String actual = getTextFromElement(By.className("result"));
        String expected = "Your registration completed";

        Assert.assertEquals(expected, actual);
    }
}
