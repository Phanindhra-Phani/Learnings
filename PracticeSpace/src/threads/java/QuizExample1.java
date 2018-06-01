package threads.java;

public class QuizExample1 implements Runnable {

	@Override
	public void run() {
		
		System.out.println("In Thread");
		
		new Thread(new QuizExample1()).start();
	}

}
