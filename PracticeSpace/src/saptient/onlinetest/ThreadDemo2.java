package saptient.onlinetest;

public class ThreadDemo2 implements Runnable {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new ThreadDemo2());
		Thread t2 = new Thread(new ThreadDemo2());
		
		t1.start();
		t2.start();
	}
	@Override
	public void run() {
		System.out.println("State: "+ Thread.currentThread().getState());
		System.out.println("Alive: "+ Thread.currentThread().isAlive());
	}
	
	

}
