package com.cydeo.step_definitions;
/*

In this class we will be able to create "pre" and "post" condition for all scenarios and steps
 */

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    //import the @Before coming from io.cucumber.java
    @Before(order=1)
    public void setupMethod() {
        System.out.println("----->@Before: RUNNING BEFORE EACH SCENARIO");

    }
//@Before (value="@login", order=2)
    /*

   @After will be executed automatically after every scenario in the project
     */
    @After
    public void tearDownMethod(Scenario scenario) {


        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }
        BrowserUtils.sleep(2);

        System.out.println("----->@After : RUNNING AFTER EACH SCENARIO");
        Driver.closeDriver();

    }

    // @BeforeStep
    public void setUpStep() {
        System.out.println("-----> @BeforeStep: RUNNING BEFORE EACH STEP");
    }

    //@AfterStep
    public void tearDownStep() {

        System.out.println("-----> @AfterStep :RUNNING AFTER EACH STEP");
    }


}
