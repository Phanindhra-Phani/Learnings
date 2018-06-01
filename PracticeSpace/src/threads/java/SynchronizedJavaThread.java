package threads.java;

public class SynchronizedJavaThread {
	
	long count = 0;
	
	class Counter {
		
		public synchronized void add(){
			count++;
		}
		
		public synchronized long getCount(){
			return count;
		}
	}
	
	class CounterThread implements Runnable{

		Counter counter = new Counter();
		@Override
		public void run() {
			counter.add();
			Thread threadName = Thread.currentThread();
			System.out.println("Counter Value: "+counter.getCount()+" :Thread Name:"+threadName.getName());
		}
		
	}
	
	public void testThread() throws InterruptedException{
		CounterThread ctrThread = new CounterThread();
		Thread thread = new Thread(ctrThread, "First Thread");
		Thread thread1 = new Thread(new CounterThread(), "Second Thread");
		thread.start();
		thread1.sleep(1000);
		thread1.start();
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		SynchronizedJavaThread synchMethod = new SynchronizedJavaThread();
		synchMethod.testThread();
	}
}
