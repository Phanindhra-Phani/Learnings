package saptient.onlinetest;

class Example extends Thread {
	
	Example() {
		System.out.println("Example");
	}
	
	public void run(String s) {
		System.out.println("Run String");
	}
	
	public void run() {
		System.out.println("Empty Run");
	}

}


