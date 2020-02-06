package com.jsonplaceholder.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;

public class PostsSteps 
{
	ValidatableResponse response;
	@When("^User sends GET request to the endpoint \"([^\"]*)\"$")
	public void user_sends_GET_request_to_the_endpoint(String arg1) 
	{
		response = SerenityRest.given().when().get(arg1).then();
	}

	@Then("^It returns all the available posts with a status code \"([^\"]*)\"$")
	public void it_returns_all_the_available_posts_with_a_status_code(String arg1) 
	{    
		response.statusCode(Integer.parseInt(arg1));
	}

	@Then("^It returns status code \"([^\"]*)\"$")
	public void it_returns_status_code(String arg1)
	{
		response.statusCode(Integer.parseInt(arg1));
	}

}
