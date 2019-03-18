package org.spring.restexamples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestExampleController {
	
	@Autowired
	private RestExampleService restExampleService;
	
	@RequestMapping(value = "/user", method = RequestMethod.POST, headers = "Accept=application/json")
	public UserEntity addUser(@RequestBody UserEntity user) {
		
		restExampleService.addUser(user);
		
		return user;
	}

}
