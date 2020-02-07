package com.jsonplaceholder.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;

public class PostsSteps {
	ValidatableResponse response;

	@When("^User sends GET request to the endpoint \"([^\"]*)\"$")
	public void user_sends_GET_request_to_the_endpoint(String arg1) {
		response = SerenityRest.given().when().get(arg1).then();
	}

	@Then("^It returns all the available posts with a status code \"([^\"]*)\"$")
	public void it_returns_all_the_available_posts_with_a_status_code(String arg1) {
		response.statusCode(Integer.parseInt(arg1));
	}

	@Then("^It returns status code \"([^\"]*)\"$")
	public void it_returns_status_code(String arg1) {
		response.statusCode(Integer.parseInt(arg1));
	}

	@Then("^All posts count is not more than (\\d+)$")
	public void all_posts_count_is_not_more_than(int arg1) 
	{
		
	}

	@When("^User sends GET request to the /posts with id as (\\d+)$")
	public void user_sends_GET_request_to_the_posts_with_id_as(int arg1)
	{
		
	}

	@Then("^It returns status code (\\d+)$")
	public void it_returns_status_code(int arg1)
	{
		
	}

	@When("^User sends POST request to the endpoint \"([^\"]*)\" with payload size greater than (\\d+)mb$")
	public void user_sends_POST_request_to_the_endpoint_with_payload_size_greater_than_mb(String arg1, int arg2)
	{
		
	}

	@Then("^Verify the error message$")
	public void verify_the_error_message()
	{
		
	}

}
