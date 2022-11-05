package com.perfleet.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = {"src/test/resources/features/login_US",
                "src/test/resources/features"},
        glue = {"com/perfleet/step_definitions/login_US",
                "com/perfleet/step_definitions/logout_US"},
        dryRun = false,
        tags = "@wip"
)

public class CukesRunner {
}
