package com.retotecnico.orangehrm.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/orangehrm.feature",
        tags = "@Caso1",
        glue = "com.retotecnico.orangehrm.stepdefinitions",
        snippets = SnippetType.CAMELCASE )
public class RunnerTags {

}
