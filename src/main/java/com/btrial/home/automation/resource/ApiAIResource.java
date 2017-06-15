package com.btrial.home.automation.resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ai")
public class ApiAIResource {

	@RequestMapping(value="/push", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String accept(@RequestBody String content) {
		
		return "{"
				+ "\"speech\": speech,"
				+ "\"displayText\": speech,"
				+ "\"data\": {},"
				+ "\"contextOut\": [],"
				+ "\"source\": \"apiai-onlinestore-shipping\"}";
	}
	
	@RequestMapping(value="/test", method = RequestMethod.GET)
	public void test() {
		
		System.out.println("test");
	}
}
