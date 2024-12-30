package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOption;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = "src/test/java/features",
  glue = "stepDefinitions",
  plugin = {"pretty", "html:target/cucumber-reports"}
  )
public class TestRunner
{
}
