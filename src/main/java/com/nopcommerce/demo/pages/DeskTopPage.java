package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeskTopPage extends Utility {

    By sortBy = By.xpath("//select[@id='products-orderby']");
    By addToCart = By.xpath("//a[contains(text(),'Build your own computer')]");
    By productAlphabetSort = By.xpath("//h2[@class='product-title']");

    public void clickOnSortByZToA(){
        selectByVisibleTextFromDropDown(sortBy, "Name: Z to A");
    }
    public void clickOnSortByAToZ(){
        selectByVisibleTextFromDropDown(sortBy, "Name: A to Z");
    }
    public void selectBuildYourComputers(){
        sendKeysToElement(addToCart, Keys.ENTER);
    }
    public void verifyTextSortByDescending() throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> originalList = driver.findElements(productAlphabetSort);
        waitUntilVisibilityOfElementLocated(productAlphabetSort, 10);
        List<String> originalProductNameList = new ArrayList<>();
        for (WebElement product : originalList) {
            originalProductNameList.add(product.getText());
        }
        originalProductNameList.sort(Collections.reverseOrder());  // We sorted this list to descending
        System.out.println(originalProductNameList);
        waitUntilVisibilityOfElementLocated(productAlphabetSort, 10);
        List<WebElement> afterSortingList = driver.findElements(productAlphabetSort);
        List<String> afterSortingProductName = new ArrayList<>();
        for (WebElement product : afterSortingList) {
            afterSortingProductName.add(product.getText());
        }
        System.out.println(afterSortingProductName);

       // Assert.assertEquals("Product not sorted", originalProductNameList, afterSortingProductName);
    }


}
