package cucumberoptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = "stepdefinitions", monochrome = true, tags = "@PlaceOrder or @Offers",
        plugin = {"html:target/cucumber.html", "json:target/cucumber.json", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "rerun:target/failed_scenarios.txt"})
public class TestRunnerJunit {

}
