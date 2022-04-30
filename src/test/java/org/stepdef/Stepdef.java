package org.stepdef;

import java.util.List;

import org.finalrun.Baseclass;
import org.finalrun.PojoClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef extends Baseclass {
	PojoClass p;

	@Given("User have to enter facebook login through chrome browser")
	public void user_have_to_enter_facebook_login_through_chrome_browser() {

		chromebrowser();
		maximise();
		launchurl("http://www.facebook.com/");
		sleep();
	}
	@When("User have to enter Valid email and Password")
	public void user_have_to_enter_Valid_email_and_Password(io.cucumber.datatable.DataTable d) {
		String email = d.asMaps().get(1).get("course");
		String pass = d.asMaps().get(0).get("Username");
		
		p = new PojoClass();
		filltextbox(p.getTxtemail(), email);
		filltextbox(p.getTxtpass(), pass);
		
	}

	@When("User have to enter Valid email and password")
	public void user_have_to_enter_Valid_email_and_password(io.cucumber.datatable.DataTable dt) {
	    List<String> li = dt.asList();
	    String email = li.get(0);
//	    making short
	    String pass = dt.asList().get(3);
	    
	     p = new PojoClass();
	    filltextbox(p.getTxtemail(), email);
	    filltextbox(p.getTxtpass(), pass);
	}
	   

	@When("User have to enter Invalid email and ivalid password")
	public void user_have_to_enter_Invalid_email_and_ivalid_password(io.cucumber.datatable.DataTable d) {
	    String email = d.asLists().get(2).get(1);
	    String pass = d.asLists().get(1).get(2);
	    p = new PojoClass();
	    
	    filltextbox(p.getTxtemail(), email);
	    filltextbox(p.getTxtpass(), pass);
	    
	    System.out.println("sucess");
	  
	}

	     
//	@When("User have to enter {string} and {string}")
//	public void user_have_to_enter_and(String email, String password) {
//		p = new PojoClass();
//		WebElement user = p.getTxtemail();
//		filltextbox(user, email);
//		WebElement pass = p.getTxtpass();
//	
//		filltextbox(pass, password);
//		
//	}

	

	@When("User have to click login button")
	public void user_have_to_click_login_button() throws InterruptedException {
		WebElement login = p.getBtnlogin();
		click(login);
		Thread.sleep(3000);
	}

	@Then("User have to enter credentialas page")
	public void user_have_to_enter_credentialas_page() {

		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.contains("privacy_mutation_token=eyJ0e")) {
			System.out.println("Open new credential page");

		} else {
			System.out.println("dont pen new cridential");
		}

	}

}
