package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WT_OrderPage extends WT_BasePage{

    public WT_OrderPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(name = "product")
    public WebElement productDropdown;

    @FindBy(xpath = "//input[@value='Visa']")
    public WebElement visaRadioButton;

    @FindBy(xpath = "//input[@value='MasterCard']")
    public WebElement masterCardRadioButton;

    @FindBy(xpath ="//input[@value='American Express']" )
    public WebElement americanExpressRadioButton;

    @FindBy(name = "card")
    public List<WebElement> cardTypes;


    @FindBy(xpath = "//input[@name='quantity']")
    public WebElement inputQuantity;

    @FindBy(xpath = "//button[.='Calculate']")
    public WebElement calculateButton;

    @FindBy(xpath = "//input[@placeholder='Full name of the customer']")
    public WebElement inputCustomerName;

    @FindBy(xpath = "//input[@placeholder='Street address of the customer']")
    public WebElement inputStreet;

    @FindBy(xpath = "//input[@placeholder='City where the customer lives']")
    public WebElement inputCity;

    @FindBy(xpath = "//input[@placeholder='State where the customer lives']")
    public WebElement inputState;

    @FindBy(xpath = "//input[@name='zip']")
    public WebElement inputZip;

    @FindBy(name = "cardNo")
    public WebElement inputCardNo;

    @FindBy(name = "cardExp")
    public WebElement inputCardExp;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement buttonProcessOrder;











}
