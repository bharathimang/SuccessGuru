package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/TestCases/LoginTest.feature"}, glue = {"glue"},
monochrome = true, plugin = {"pretty","junit:target/Reports/test2.xml"},
strict = true, tags = {"@test1"})
public class TestRunner {

}
