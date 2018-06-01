package threads.java;

public class ThreadsExecuteOneAfterOther {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Running Thread1");
				for (int i = 0; i < 1000000; i++) {
					
				}
				
			}
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Running Thread2");
				
			}
		});
		
		Thread t3 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Running Thread3");
			}
		});
		t1.start();
		t1.join();
		

		
		t2.start();
		t2.join();
		

		
		t3.start();
		t3.join();
		
		
	}

}
