package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {

    public class ComputersPage extends Utility {

        By deskTopLink = By.xpath("//img[contains(@title,'Show products in category Desktops')]");

        public void clickOnDeskTopLink() {
            clickOnElement(deskTopLink);
        }

    }
}

