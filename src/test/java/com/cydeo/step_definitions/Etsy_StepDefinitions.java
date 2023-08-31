package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class Etsy_StepDefinitions {
    EtsyPage etsyPage = new EtsyPage();

    @Given("User is on the Etsy homepage")
    public void user_is_on_the_etsy_homepage() {
        Driver.getDriver().get("https://www.etsy.com");
        Driver.getDriver().findElement(By.cssSelector("[class='wt-btn wt-btn--filled wt-mb-xs-0']")).click();
    }

    @Then("User should see the title is as expected")
    public void user_should_see_the_title_is_as_expected() {
        String expectedTitle = "Etsy Deutschland – Kaufe Handgefertigtes, Vintage-Sachen, Spezialanfertigungen und einzigartige Geschenke für alle ein.";
        BrowserUtils.verifyTitle(expectedTitle);
    }


    @When("User types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        etsyPage.searchBox.sendKeys("Wooden Spoon");
    }

    @When("User clicks search button")
    public void user_clicks_search_button() {
        etsyPage.searchButton.click();

    }

    @Then("User sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {
        BrowserUtils.verifyTitleContains("Wooden spoon");
    }


    @When("User types {string} in the search box")
    public void userTypesInTheSearchBox(String keyword) {
        etsyPage.searchBox.sendKeys(keyword);
    }

    @Then("User sees {string} is in the title")
    public void userSeesIsInTheTitle(String expectedTitle) {
        BrowserUtils.verifyTitleContains(expectedTitle);
    }
}
