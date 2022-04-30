package org.finalrun;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\FeatureFile", glue = "org.stepdef", dryRun = false, monochrome = true, strict = true, plugin = {
		"html:C:\\Users\\INTEL\\eclipse-workspace\\11amCucum\\Report\\HTML",
		"json:C:\\Users\\INTEL\\eclipse-workspace\\11amCucum\\Report\\Json\\folder.json",
		"junit:C:\\Users\\INTEL\\eclipse-workspace\\11amCucum\\Report\\Junit\\folder1.junit",
		"rerun:Report\\Rerun\\filename4.txt"

})

public class RunAll {
	@AfterClass
	public static void report() {
		JVMreport.generateJVMreport("C:\\Users\\INTEL\\eclipse-workspace\\11amCucum\\Report\\Json\\folder.json");

	}

}
