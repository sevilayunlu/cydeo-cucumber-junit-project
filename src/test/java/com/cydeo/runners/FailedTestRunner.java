package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features="@target/rerun.txt",//we say to the runner "do not go into src folder at all, jump directly to the rerun file inside  the target folder
        glue="com/cydeo/step_definitions"//the job of the cukes_runner is to be able to execute any scenario. That 's why, we have the same path in cukes-runner and in failed test runner classes.

)

public class FailedTestRunner {

}
