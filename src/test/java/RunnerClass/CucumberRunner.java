package RunnerClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(strict = true, monochrome = true,
        features = "src/test/resources/features",
        glue = "stepdefinition"
)
public class CucumberRunner extends AbstractTestNGCucumberTests {


}
