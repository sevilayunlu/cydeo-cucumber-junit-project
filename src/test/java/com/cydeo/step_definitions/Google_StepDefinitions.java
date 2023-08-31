package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Google_StepDefinitions {
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();//in the test ng, we were creating the object at the class level and
    // instantiate it in the before method. In the cucumber, we can create and instantiate it at the class level. It will be used by each step in the same scenario.

    @When("user is on the Google search page")
    public void user_is_on_the_google_search_page() {
        Driver.getDriver().get("https://www.google.com");

        //skip cookies
        BrowserUtils.sleep(1);
        Driver.getDriver().findElement(By.cssSelector("[id='L2AGLb']")).click();
        WebElement search = Driver.getDriver().findElement(By.name("q"));
        BrowserUtils.sleep(1);
    }

    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";

        Assert.assertTrue(actualTitle.equals(expectedTitle));

        Driver.closeDriver();
    }


    @When("user searches for {word}")
    public void user_searches_for_apple(String word) {
        googleSearchPage.searchBox.sendKeys(word + Keys.ENTER);
    }

    @Then("user should see the title {word}")
    public void user_should_see_the_title(String word) {
        BrowserUtils.verifyTitle(word+" - Google'da Ara");
    }

}
