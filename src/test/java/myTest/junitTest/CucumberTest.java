package myTest.junitTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"myTest.junitTest.stepdef"},
        features = {"src/test/resources/login.feature"},
        plugin = {"pretty","html:reports/cucumber.html", "json:reports/cucumber.json"}
)
public class CucumberTest {
}