package RunnerFile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(features = {"@target/failedrerun.txt"}, glue = {"stepDefinitions"},
        monochrome = true,
//        plugin = { "pretty", "json:target/cucumber/report.json",
//			"html:target/cucumber/report.html",
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        publish = false)

public class FailedRun extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }


}
