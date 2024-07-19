package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = "html:raporlar/CucumberReport.html",
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@edge",
        dryRun = false
)
public class Runner {
}
