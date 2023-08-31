package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    public LibraryLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "#inputEmail")
    public WebElement emailInput;

    @FindBy(css = "#inputPassword")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;

    public void loginAsLibrarian() {
        emailInput.sendKeys(ConfigurationReader.getProperty("lib22_user"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("lib22_pass"));
        signInButton.click();


    }
    public void loginAsLibrarian(String email, String password){
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        signInButton.click();
    }


}
