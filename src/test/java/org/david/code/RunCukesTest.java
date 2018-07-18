package org.david.code;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "org.david.code.step_definitions",
        plugin = {"pretty", "json:target/cucumber-json-reports/cucumber.json"},
        tags = {"not @wip"}
)
public class RunCukesTest {
}
