package saptient.onlinetest;

public class Big extends Thread {
	
	Big(Runnable ren) {
		super(ren);
	}
	
	public void run() {
		System.out.println("Big");
	}
}
