package threads.java;



public class ThreadExecutution {
	
	public static void main(String[] args) {
	
		//Using Thread Extends class
//		Thread myThread = new MyThread();
//		String threadName = myThread.getName();
//		System.out.println("Thread Name:::"+threadName);
//		myThread.start();
		
		//Using Runnable interface
		Thread myThread1 = new Thread(new MyThreadImplements(),"Jaffa Threads");
		System.out.println("Thread Name: "+myThread1.getName());
		myThread1.start();
//		myThread1.run(); Run under main Thread;
		
		Thread myThread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Anonymous class");
				
			}
		});
		
		myThread.start();
//		myThread.start(); Throws IllegalStartExecption

		int i =3;
		double b= (float)i;
		
		
	}
	
}
