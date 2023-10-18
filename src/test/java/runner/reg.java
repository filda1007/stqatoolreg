package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="/stqatoolreg/src/test/java/feature/stqa.feature",
glue="StepDefinitions",tags="@RegressionTest")
public class reg {

}
