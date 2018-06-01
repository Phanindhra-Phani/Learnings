package threads.java;

public class NotifyTest {
	
	public static void main(String[] args) {
		
		Message msg = new Message("Process it");
		Thread t1 = new Thread(new Waiter(msg),"waiter");
		t1.start();
		Thread t3 = new Thread(new Waiter(msg),"waiter1");
		t3.start();
		
		Thread t2 = new Thread(new Notifier(msg),"Notifier");
		t2.start();
	}

}
