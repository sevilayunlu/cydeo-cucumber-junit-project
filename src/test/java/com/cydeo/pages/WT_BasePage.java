package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WT_BasePage {//we can use a base page and extend this page to other pages, if there is a page where some common webElements are shared by other pages.
    WT_BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[text()='View all orders']")
   public  WebElement viewAllOrdersLink;

    @FindBy(xpath = "//button[text()='View all products']")
    public  WebElement viewAllProductsLink;

    @FindBy(xpath = "//button[text()='Order']")
    public  WebElement orderLink;

    @FindBy(xpath = "//button[text()='Logout']")
    public  WebElement logoutLink;


}
