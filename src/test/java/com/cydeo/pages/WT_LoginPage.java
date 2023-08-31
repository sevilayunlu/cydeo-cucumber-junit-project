package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WT_LoginPage {
    public WT_LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "username")
    public WebElement usernameBox;

    @FindBy(name = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//button[.='Order']")
    public WebElement orderBox;

    @FindBy()
    public WebElement productDropDown;

    /**
     * This method will log in with below credentials;
     * username: Test
     * password: Tester
     */
    public void login() {
        this.usernameBox.sendKeys("Test");
        this.passwordBox.sendKeys("Tester");
        this.loginButton.click();
    }

    /**
     * This method will log in with credentials that are provided in the method at the time of calling it
     * @param username
     * @param password
     */
    public void login(String username, String password) {
        this.usernameBox.sendKeys("Test");
        this.passwordBox.sendKeys("Tester");
        this.loginButton.click();
    }

}
