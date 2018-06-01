package threads.java;


public class InterThreadCommunicationExample {
	
	class Chat {
		
		boolean flag = false;
		
		public synchronized void question(String msg){
			if(flag) {
				try{
					wait();
				}catch(InterruptedException ex){
					
				}
			}
			System.out.println(msg);
			flag = true;
			notify();
		}
		
		public synchronized void answer(String msg){
			if(!flag) {
				try{
					wait();
				}catch(InterruptedException ex){
					
				}
			}
			System.out.println(msg);
			flag = false;
			notify();
		}
	}
	
	class Thread1 implements Runnable{
		
		Chat m;
		String[] m1 = {"Hi", "How are you?", "I am also doing great!"};
		
		public Thread1(Chat m1) {
	        this.m = m1;
	        new Thread(this, "Question").start();
	    }
		
		@Override
		public void run(){
			for(int i=0; i<m1.length; i++){
				m.question(m1[i]);
			}
		}
	}
	
	class Thread2 implements Runnable{
			
			Chat m;
			String[] m1 = {"Hi", "I am good, How about you?", "Great buddy!"};
			
			public Thread2(Chat m1) {
		        this.m = m1;
		        new Thread(this, "Answer").start();
		    }
			
			@Override
			public void run(){
				for(int i=0; i<m1.length; i++){
					m.answer(m1[i]);
				}
			}
		}
	
	public void test(){
		Chat m = new Chat();
		new Thread1(m);
		new Thread2(m);
		
	}
	
	public static void main(String[] args) {
		InterThreadCommunicationExample ex = new InterThreadCommunicationExample();
		ex.test();
	}
	

}
