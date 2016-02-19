package com.test.cucumber;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinition2 {
	
	@Given("^My second first step$")
	public void my_second_first_step() throws Throwable {
	   Assert.assertTrue(true);
	}
	

	@Then("^this is my second last step$")
	public void this_is_my_second_last_step() throws Throwable {
		Assert.assertTrue(true);
	}


}
