package threads.java;

public class DeadLockExample {
	
	class Product{
		int data = 1;
		
	}
//	class Thread1 implements Runnable{
//		Product product;
//		
//		public Thread1(Product product) {
//			this.product = product;
//		}
//		
//		@Override
//		public void run() {
//			synchronized (product) {
//				
//			}
//			
//		}
//		
//	}
	
	class Thread2 implements Runnable{

		Product product;
		
		public Thread2(Product product) {
			this.product = product;
		}
		
		@Override
		public void run() {
			synchronized (product) {
				for (int i = 0; i > -1; i++) {
					System.out.println(Thread.currentThread().getName());
				}
			}
			
		}
		
	}
	
	public void test() {
		Product product = new Product();
		Thread thread1 = new Thread(new Thread2(product));
		Thread thread2 = new Thread(new Thread2(product));
		Thread thread3 = new Thread(new Thread2(product));
		Thread thread4 = new Thread(new Thread2(product));
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		

	}
	public static void main(String[] args) {
		DeadLockExample deadLockExample = new DeadLockExample();
		deadLockExample.test();
		
		
	}

}
