package org.spring.restexamples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestExampleService {

	@Autowired
	private RestExampleDao restExampleDao;
	
	public void addUser(UserEntity user) {
		restExampleDao.addUser(user);
	}

}
