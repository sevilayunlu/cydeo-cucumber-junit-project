package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryDashboardPage {
    public LibraryDashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user_count")
    public WebElement usersNumber;

    @FindBy(css = "a#navbarDropdown>span")
    public WebElement userName;




}
