package seleniumfree.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import seleniumfree.pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/features" }, glue = { "seleniumfree.steps" }, plugin = { "pretty",
        "html:target/cucumber-reports" }, tags = "@Cart")

public class TestRunner{
    @AfterClass
    public static void cerrarGhrome() {
    BasePage.cerrarNavegador();
    }

}
