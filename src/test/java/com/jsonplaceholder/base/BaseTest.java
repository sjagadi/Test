package com.jsonplaceholder.base;

import org.junit.BeforeClass;

import io.restassured.RestAssured;

public class BaseTest 
{
	@BeforeClass
	public static void init()
	{
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
	}

}
