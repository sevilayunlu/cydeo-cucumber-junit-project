package com.cydeo.step_definitions;

import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

public class DataTables_StepDefinitions {
    @Then("user should see below list")
    public void user_should_see_below_list(List<String> fruitsAndVegetables) {

        System.out.println("fruitsAndVegetables = " + fruitsAndVegetables);

    }


    @Then("user sees below list")
    public void userSeesBelowList(List<String> pets) {

        System.out.println("pets = " + pets);
    }

    @Then("officer is able to see any data he wants")
    public void officer_is_able_to_see_any_data_he_wants(Map<String, String> driverInfo) {
        System.out.println("driverInfo = " + driverInfo);
        System.out.println("driverInfo.get(\"name\") = " + driverInfo.get("name"));
        System.out.println("driverInfo.get(\"address\") = " + driverInfo.get("address"));
        System.out.println("driverInfo.size() = " + driverInfo.size());
    }







}
