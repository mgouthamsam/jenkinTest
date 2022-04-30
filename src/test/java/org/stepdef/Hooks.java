package org.stepdef;

import org.finalrun.Baseclass;
import org.finalrun.PojoClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import cucumber.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Baseclass {

	@Before
	public void bfr() {
		System.out.println("Before Scenario ");
	
	}

	@Before(order=1)
	public void bfr1() {
		System.out.println("Before Scenario 1");
	}

	@Before(order = 2)
	public void bfr2() {
		System.out.println("Before Scenario 2");
	}

	@After
	public void aftr() {
		System.out.println("After scenario");
	}

	@After(order = 1)
	public void aft1() {
		System.out.println("After Scenario 1");
	}

	@After(order = 2)
	public void aft2(Scenario s) {
		if (s.isFailed()) {
			TakesScreenshot tk = (TakesScreenshot)driver;
			byte[] scs = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(scs, "image/png");
			
			
			
			
			
		}
		System.out.println("After Scenario 2");
		closebrowser();
	}
}