package saptient.onlinetest;

public class Test {

	public static void main(String[] args) {
		
		Example ex = new Example() {
			public void run() {
				System.out.println("Anonymous Run");
			}
		};
		ex.start();
	}
}