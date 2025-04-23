package com.wjbuelvas.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/list_all_users.feature"},
        glue = {"com.wjbuelvas.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class ListAllUsers {

}