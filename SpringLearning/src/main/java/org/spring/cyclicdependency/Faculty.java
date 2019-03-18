package org.spring.cyclicdependency;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Faculty implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1L;
	
	private Branch branch;
	
//	@Autowired
//	public Faculty(Branch branch) {
//		this.branch = branch;
//		System.out.println("&&&&&&&&&&& In Constructor of Faculty &&&&&&&&&&&&&&&&");
//	}
	
	public Branch getBranch() {
		return branch;
	}

	@Autowired
	public void setBranch(Branch branch) {
		this.branch = branch;
		System.out.println("In branch setter in Faculty class");
	}

	public void printHello() {
		System.out.println("*********** I am printing Hello in Faculty class ***********");
	}
	

}
