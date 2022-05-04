package com.nopcommerce.demo.pages;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utility {

    public By inputProcessor = By.xpath("//body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[7]/dl[1]/dd[1]/select[1]");
    public By inputRAM = By.id("product_attribute_2");
    public By radioHDD = By.id("product_attribute_3_7");
    public By radioOS = By.id("product_attribute_4_9");
    public By buttonAddToCart = By.xpath("//body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[9]/div[1]/button[1]");
    public By checkBoxTotalCommander = By.id("product_attribute_5_12");

    public void insertSpecs(){
        selectByIndexFromDropDown(inputProcessor, 1);
        selectByIndexFromDropDown(inputRAM, 3);

        clickOnElement(radioHDD);
        clickOnElement(radioOS);
        clickOnElement(checkBoxTotalCommander);
    }

    public void clickAddToCartButton(){
        clickOnElement(buttonAddToCart);
    }

}
