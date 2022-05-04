package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class CellPhonePage extends Utility {

    By verifyTextCellPhones = By.xpath("//h1[contains(text(),'Cell phones')]");
    By listViewTab = By.xpath("//a[contains(text(),'List')]");
    By nokiaLumia = By.xpath("//a[normalize-space()='Nokia Lumia 1020']");


    public void textCellPhones() {
        verifyText("Cell phones", verifyTextCellPhones, "Error-Message not match");
    }

    public void clickListViewTab() {
        clickOnElement(listViewTab);
    }

    public void clickNokiaLumia() {
        sendKeysToElement(nokiaLumia, Keys.ENTER);
    }


}
