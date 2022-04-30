package org.stepdef;

import org.finalrun.Baseclass;
import org.finalrun.PojoClass;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef1 extends Baseclass{
	PojoClass p;
	
	@Given("user have to enter Facebook through chrome browser")
	public void user_have_to_enter_Facebook_through_chrome_browser() {
	 chromebrowser();
	 maximise();
	  launchurl("https://www.facebook.com/");
	  
	}

	@Given("user have to click forget password")
	public void user_have_to_click_forget_password() {
		p = new PojoClass();
		WebElement btnfrgtpass = p.getBtnfrgtpass();
		btnfrgtpass.click();
	}

	@When("user have to enter phone number")
	public void user_have_to_enter_phone_number() {
		filltextbox(p.getPhnum(), "8608609692");
	}

	@Then("user have to click search button")
	public void user_have_to_click_search_button() {
		WebElement btnsrch = p.getBtnsrch();
		btnsrch.click();
	}

}
