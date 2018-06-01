package com.designpatterns.AdapterPattern;

/*
 * We have implement Pen class here. But we are not going to write any thing new.
 * We will make use of PilotPen class
 * 
 * This class acts as Adapter between Pen and PilotPen
 */
public class PenAdapter implements Pen {

	PilotPen pilotPen = new PilotPen();
	
	@Override
	public void wirte(String str) {
		pilotPen.mark(str);
	}

}
