package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import dev.failsafe.internal.util.Assert;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    //? Locators used to reference the login link and the register link
    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");

    //? instance variables, reference to the different links of the top menu
    public By menuComputers = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");
    public By menuComputesPage = By.xpath("//h1[contains(text(),'Computers')]");
    public By menuElectronics = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a");
    public By menuApparel = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/a");
    public By menuDigitaldownloads = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[4]/a");
    public By menuBooks = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[5]/a");
    public By menuJewelry = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[6]/a");
    public By menuGiftCard = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[7]/a");

    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }

    //? parameter link is used to reference the link on the top menu
    public String getPageTitle(By link){
        //? click the link on the top menu
        clickOnElement(link);
        //? return the text of the page title
        return getTextFromElement(By.className("page-title"));
    }

    public void hoverAndClickElectronics(){
        mouseHoverToElement(menuElectronics);
        clickOnElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/ul/li[2]/a"));
        assert getTextFromElement(By.className("page-title")).equals("Cell phones") : "The titles do not match";
    }




}
