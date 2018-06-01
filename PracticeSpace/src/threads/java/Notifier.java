package threads.java;

public class Notifier implements Runnable{

	Message msg;
	
	public Notifier(Message msg){
		this.msg = msg;
	}
	
	@Override
	public void run(){
		String name = Thread.currentThread().getName();
		try{
			Thread.sleep(1000);
			synchronized (msg) {
				msg.setMessage(name + " Notifier work done");
//				msg.notify();
				msg.notifyAll();
			}
		}catch(InterruptedException ie){
			
		}
	}
}
