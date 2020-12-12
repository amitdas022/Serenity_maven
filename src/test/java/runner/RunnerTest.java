package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.junit.runners.SerenityRunner;

@RunWith(CucumberWithSerenity.class)


@CucumberOptions(
        features = "src/test/resources/features/logoutAPI.feature",
        glue= "StepDefinitions",
        monochrome = true,
        plugin = "html:target/automationreport.html")
public class RunnerTest {
}
