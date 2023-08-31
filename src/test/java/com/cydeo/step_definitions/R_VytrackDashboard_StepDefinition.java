package com.cydeo.step_definitions;

import com.cydeo.pages.R_VytrackDashBoardPage;
import com.cydeo.pages.R_VytrackLoginPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class R_VytrackDashboard_StepDefinition {
    R_VytrackDashBoardPage vytrackDashBoardPage=new R_VytrackDashBoardPage();
    R_VytrackLoginPage rVytrackLoginPage=new R_VytrackLoginPage();

    @Then("user should be able to see following modules")
    public void user_should_be_able_to_see_following_modules(List<String> expectedModules) {
        BrowserUtils.sleep(3);
        List<String> actualModules=new ArrayList<>();

        for (WebElement eachTopModule : vytrackDashBoardPage.allTopModules) {
            actualModules.add(eachTopModule.getText());
        }


        Assert.assertEquals(expectedModules,actualModules);
    }




    @When("user enters below credentials")
    public void user_enters_below_credentials(Map<String, String> credentials) {
        String username=credentials.get("username");
        String password=credentials.get("password");
        rVytrackLoginPage.login(username,password);






    }
    @Then("user should be able to see following information")
    public void user_should_be_able_to_see_following_information(Map<String, String> userInfo) {
       String actualUserInfo= vytrackDashBoardPage.userLink.getText();
       String expectedUerInfo=userInfo.get("firstname")+" "+userInfo.get("lastname");
       Assert.assertEquals(expectedUerInfo,actualUserInfo);


    }


}
