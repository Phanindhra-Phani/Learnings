package threads.java;

public class Waiter implements Runnable {

	Message msg;
	
	public Waiter(Message msg){
		this.msg = msg;
	}
	
	@Override
	public void run(){
		String name= Thread.currentThread().getName();
		synchronized (msg) {
		
			try{
				System.out.println(name+" waiting to get notified at time:"+System.currentTimeMillis());
				msg.wait();
			}catch(InterruptedException ie){
				
			}
			System.out.println("Waiter thread got notified: "+name);
			System.out.println("It got processed: "+name);
		}
		
	}
}
