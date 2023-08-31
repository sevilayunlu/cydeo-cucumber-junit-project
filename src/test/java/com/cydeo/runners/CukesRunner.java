package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"

        },
        publish = true,//generates a report link
       // ,monochrome = true

        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        dryRun =false,
        tags = "@all_accounts" //if we put a tag on the top of the scenario, only this scenario will be executed
        //Tags are case-sensitive
        //or keyword is for being less specific
        //and keyword s used for being more specific and both sides has to be contained
        // dryRun = true-- which will give us just the unimplemented snippets

)


public class CukesRunner {

}
