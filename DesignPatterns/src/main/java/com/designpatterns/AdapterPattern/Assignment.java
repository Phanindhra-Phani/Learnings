package com.designpatterns.AdapterPattern;

public class Assignment {
	
	private Pen pen;

	public Pen getPen() {
		return pen;
	}

	public void setP(Pen pen) {
		this.pen = pen;
	}

	public void writeAssignment(String str) {
		pen.wirte(str);
	}
}
