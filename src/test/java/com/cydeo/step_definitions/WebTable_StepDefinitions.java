package com.cydeo.step_definitions;

import com.cydeo.pages.WT_LoginPage;
import com.cydeo.pages.WT_OrderPage;
import com.cydeo.pages.WT_ViewAllOrdersPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class WebTable_StepDefinitions {
    WT_LoginPage webTablesPage = new WT_LoginPage();

    @Given("User is on the web table app login page")
    public void user_is_on_the_web_table_app_login_page() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
    }

    @When("User enters valid username")
    public void user_enters_valid_username() {
        webTablesPage.usernameBox.sendKeys("Test");
    }

    @When("User enters  valid password")
    public void user_enters_valid_password() {
        webTablesPage.passwordBox.sendKeys("Tester");
    }

    @When("USer clicks to login button")
    public void u_ser_clicks_to_login_button() {
        webTablesPage.loginButton.click();


    }

    @Then("URL title should see orders word in the URL")
    public void url_title_should_see_orders_word_in_the_url() {
        BrowserUtils.verifyURLContains("orders");

    }

    @When("User enters {string} username and {string} password")
    public void userEntersUsernameAndPassword(String username, String password) {
        webTablesPage.usernameBox.sendKeys(username);
        webTablesPage.passwordBox.sendKeys(password);
    }

    @When("User enters below correct credentials")
    public void userEntersBelowCorrectCredentials(Map<String, String> credentials) {
        webTablesPage.usernameBox.sendKeys(credentials.get("username"));
        webTablesPage.passwordBox.sendKeys(credentials.get("password"));


    }

    @Given("user is already logged in to The Web table app")
    public void user_is_already_logged_in_to_the_web_table_app() {

        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
        webTablesPage.login();


    }

    WT_OrderPage wtOrderPage = new WT_OrderPage();

    @When("user is on the “Order” page")
    public void user_is_on_the_order_page() {


        wtOrderPage.orderLink.click();


    }

    @Then("user sees below options under “product” dropdown")
    public void user_sees_below_options_under_product_dropdown(List<String> expectedOptions) {
        wtOrderPage.productDropdown.click();

        List<String> actualOptions = BrowserUtils.dropDownOptions_as_String(wtOrderPage.productDropdown);


        Assert.assertEquals(expectedOptions, actualOptions);

    }


    @Then("user sees VISA as enables payment option")
    public void userSeesVISAAsEnablesPaymentOption() {
        Assert.assertTrue(wtOrderPage.visaRadioButton.isEnabled());


    }

    @Then("user sees MasterCard as enables payment option")
    public void userSeesMasterCardAsEnablesPaymentOption() {
        Assert.assertTrue(wtOrderPage.masterCardRadioButton.isEnabled());


    }

    @Then("user sees American Express as enables payment option")
    public void userSeesAmericanExpressAsEnablesPaymentOption() {
        Assert.assertTrue(wtOrderPage.americanExpressRadioButton.isEnabled());


    }

    @And("user enters quantity {string}")
    public void userEntersQuantity(String quantity) {
        wtOrderPage.inputQuantity.clear();
        //wtOrderPage.inputQuantity.sendKeys(Keys.BACK_SPACE);-- another option as deleting whatever already in the input box
        wtOrderPage.inputQuantity.sendKeys("2");
    }

    @Then("user clicks to the calculate button")
    public void userClicksToTheCalculateButton() {
        wtOrderPage.calculateButton.click();
    }

    @And("user enters customer name {string}")
    public void userEntersCustomerName(String name) {
        wtOrderPage.inputCustomerName.sendKeys(name);
    }

    @And("user enters street {string}")
    public void userEntersStreet(String street) {
        wtOrderPage.inputStreet.sendKeys(street);
    }

    @And("user enters state {string}")
    public void userEntersState(String state) {
        wtOrderPage.inputState.sendKeys(state);
    }


    @And("user selects payment option {string}")
    public void userSelectsPaymentOption(String expectedCardType) {
        wtOrderPage.americanExpressRadioButton.click();
        BrowserUtils.clickRadioButton(wtOrderPage.cardTypes, expectedCardType);
    }


    @And("user enters credit card number {string}")
    public void userEntersCreditCardNumber(String number) {
        wtOrderPage.inputCardNo.sendKeys(number);
    }

    @And("user enters expiration date {string}")
    public void userEntersExpirationDate(String date) {
        wtOrderPage.inputCardExp.sendKeys(date);
    }

    @And("user clicks to process order button")
    public void userClicksToProcessOrderButton() {
        wtOrderPage.buttonProcessOrder.click();
    }

    @And("user enters city {string}")
    public void userEntersCity(String city) {
        wtOrderPage.inputCity.sendKeys(city);
    }

    @And("user enters zip {string}")
    public void userEntersZip(String zip) {
        wtOrderPage.inputZip.sendKeys(zip);
    }

    WT_ViewAllOrdersPage viewAllOrdersPage = new WT_ViewAllOrdersPage();

    @Then("user should see {string} in the first row of the web table")
    public void userShouldSeeInTheFirstRowOfTheWebTable(String expectedName) {
        String actualName = viewAllOrdersPage.newCustomerCell.getText();
        Assert.assertEquals(expectedName, actualName);

    }

}
