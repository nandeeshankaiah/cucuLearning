package com.test.cucumber;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinition {
	
	@Given("^this is my first step$")
	public void this_is_my_first_step() throws Throwable {
	  Assert.assertTrue(true);
	}

	@Then("^this is my last step$")
	public void this_is_my_last_step() throws Throwable {
		 Assert.assertTrue(false);
	}


}
