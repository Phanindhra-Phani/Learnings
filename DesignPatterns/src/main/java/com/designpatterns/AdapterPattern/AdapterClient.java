package com.designpatterns.AdapterPattern;

/*
 * https://www.youtube.com/watch?v=nZ76x13Nm8Q&list=PLsyeobzWxl7r2ZX1fl-7CKnayxHJA_1ol&index=10
 */

public class AdapterClient {
	
	public static void main(String[] args) {
		
		Assignment assignment = new Assignment();
		
		Pen pen = new PenAdapter();
		assignment.setP(pen);
		
		assignment.writeAssignment("I am writing my first Assignment");
		
	}

}
