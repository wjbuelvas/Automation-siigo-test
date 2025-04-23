package com.wjbuelvas.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/add_a_user.feature"},
        glue = {"com.wjbuelvas.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class AddAUser {

}