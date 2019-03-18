package saptient.onlinetest;

public class ThreadDemo1 {
	
	public static void main(String[] args) {
		Thread t1 = new Big(new Small());
		t1.start();
	}

}
