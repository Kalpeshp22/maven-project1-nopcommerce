package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

    HomePage homepage = new HomePage();

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        String pageTitle = homepage.getPageTitle(homepage.menuComputers);
        Assert.assertEquals("Computers", pageTitle, "The page Titles do not match");
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        String pageTitle = homepage.getPageTitle(homepage.menuElectronics);
        Assert.assertEquals("Electronics", pageTitle, "The page Titles do not match");
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        String pageTitle = homepage.getPageTitle(homepage.menuApparel);
        Assert.assertEquals("Apparel", pageTitle, "The page Titles do not match");

    }
    @Test
      public void userShouldNavigateToDigitalDownloadsPageSuccessfull(){
          String pageTitle = homepage.getPageTitle(homepage.menuDigitaldownloads);
          Assert.assertEquals("Digital downloads", pageTitle, "The page Titles do not match");
      }
      @Test
      public void userShouldNavigateToBooksPageSuccessfully(){
          String pageTitle = homepage.getPageTitle(homepage.menuBooks);
          Assert.assertEquals("Books", pageTitle, "The page Titles do not match");

      }
      @Test
      public void userShouldNavigateToJewelryPageSuccessfully(){
          String pageTitle = homepage.getPageTitle(homepage.menuJewelry);
          Assert.assertEquals("Jewelry", pageTitle, "The page Titles do not match");

      }
      @Test
       public void userShouldNavigateToGiftCardPageSuccessfully(){
           String pageTitle = homepage.getPageTitle(homepage.menuGiftCard);
           Assert.assertEquals("Gift Cards", pageTitle, "The page Titles do not match");
    }

}
