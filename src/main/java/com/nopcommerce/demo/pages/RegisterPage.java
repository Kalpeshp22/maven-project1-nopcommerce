package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

import java.time.Year;

public class RegisterPage extends Utility {

    public By inputGender = By.id("gender-male");
    public By inputFirstName = By.id("FirstName");
    public By inputLastName = By.id("LastName");
    public By inputDate = By.name("DateOfBirthDay");
    public By inputMonth = By.name("DateOfBirthMonth");
    public By inputYear = By.name("DateOfBirthYear");
    public By inputEmail = By.id("Email");
    public By inputPassword = By.id("Password");
    public By inputConfirmPassword = By.id("ConfirmPassword");
    public By RegisterButton = By.id("register-button");

    public void enterGender(){
        clickOnElement(inputGender);
    }

    public void enterFirstName(String firstName){
        sendTextToElement(inputFirstName, firstName);
    }
    public void enterLastName(String LastName){
        sendTextToElement(inputLastName,LastName);
    }
    public void enterDateOfBirth(String Date,String Month,String Year){
       sendTextToElement(inputDate, Date);
       sendTextToElement(inputMonth,Month);
       sendTextToElement(inputYear, Year);
    }
    public void enterEmail(String Email){
        sendTextToElement(inputEmail,Email);

    }
    public void enterPassword(String password){
        sendTextToElement(inputPassword,password);

    }
    public void  enterConfirmPassword(String ConfirmPassword){
        sendTextToElement(inputConfirmPassword,ConfirmPassword);

    }
    public void clickRegisterButton(){
        clickOnElement(RegisterButton);

    }
}
