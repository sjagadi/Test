Feature: Resource /post should be renamed to /posts
	Scenario: Posts endpoint accepts HTTP GET and provide all the available posts with status code as 200
		When User sends GET request to the endpoint "/posts"
		Then It returns all the available posts with a status code "200"
	
	Scenario: Post end point returns 404 status when GET method is used
		When User sends GET request to the endpoint "/post"
		Then It returns status code "404"
#	
#	Scenario: The endpoint /posts?id=1 returns the post having id as 1 when GET method is used
#		When User sends GET request to the endpoint "/posts?id=1"