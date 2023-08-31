package com.cydeo.step_definitions;

import com.cydeo.pages.BingSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Bing_StepDefinitions {
    BingSearchPage bingSearchPage = new BingSearchPage();

    @Given("user is on the Big search box")
    public void user_is_on_the_big_search_box() {
        Driver.getDriver().get("https://www.bing.com");
        BrowserUtils.sleep(2);
        WebElement accept = Driver.getDriver().findElement(By.xpath("//button[@id='bnp_btn_accept']"));
        accept.click();
    }

    @When("user enters orange in the Bing search box")
    public void user_enters_orange_in_the_bing_search_box() {

        bingSearchPage.searchBox.sendKeys("orange" + Keys.ENTER);
    }

    @Then("user should see orange in the title")
    public void user_should_see_orange_in_the_title() {

        BrowserUtils.verifyTitleContains("orange");
    }


    @When("user enters {string}in the Bing search box")
    public void userEntersInTheBingSearchBox(String searchKey) {
        bingSearchPage.searchBox.sendKeys(searchKey + Keys.ENTER);
    }

    @Then("user should see {string} in the title")
    public void userShouldSeeInTheTitle(String expectedTitle) {

        BrowserUtils.verifyTitleContains(expectedTitle);
    }


}
