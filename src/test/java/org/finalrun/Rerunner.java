package org.finalrun;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@Rerun\\filename4.txt", glue = "org.stepdef", dryRun = false, monochrome = true, strict = true, plugin = {
		
		"rerun:C:\\Users\\INTEL\\eclipse-workspace\\11amCucum\\Rerun\\filename6.txt"

})

public class Rerunner {
	
	@AfterClass
	public static void report() {
		JVMreport.generateJVMreport("C:\\Users\\INTEL\\eclipse-workspace\\11amCucum\\Report\\Json\\folder.json");

	

}
}
