package org.spring.cyclicdependency;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Branch implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1L;
	
	private Faculty faculty;
	
	public Faculty getFaculty() {
		return faculty;
	}

	@Autowired
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
		System.out.println("In faculty setter in Branch class");
	}

//	@Autowired
//	public Branch(Faculty faculty) {
//		this.faculty = faculty;
//		System.out.println("&&&&&&&&&&& In Constructor of Branch &&&&&&&&&&&&&&&&");
//	}
	
	public void printHello() {
		faculty.printHello();
		System.out.println("*********** I am printing Hello in Branch class ***********");
	}

}
