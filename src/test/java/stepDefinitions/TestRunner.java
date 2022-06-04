package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/wikipedia.feature", glue = {"stepDefinitions"}, tags="@tag",
plugin = {"pretty","html:target/HTMLReports.html"})
public class TestRunner {

}
