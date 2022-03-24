package com.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty",
                "html:target/cuc++umber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        },
        features = "classpath:Features",
        glue = {"com.Stepdefs"},
        tags = "",
        publish = true,
        monochrome = true,
        dryRun = false
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
