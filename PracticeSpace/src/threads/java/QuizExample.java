package threads.java;

public class QuizExample implements Runnable {

	@Override
	public void run() {
		System.out.println("In thread");

	}

	public static void main(String[] args) {
		
		//Works fine
		QuizExample qz = new QuizExample();
		Thread th = new Thread(qz);
		th.start();
		
		//Doesn't work fine
//		Thread th = new Thread(QuizExample);
		
//		Thread th = new Thread();
//		th.start();
		
	}
}
