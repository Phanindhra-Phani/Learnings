package java8;

public class EffectivelyFinalVariable {
	
	public static void main(String[] args) {
		
		final String effectiveFinalVariable = "Potti";
		Thread tr = new Thread(new Runnable() {
			public void run() {
				System.out.println(effectiveFinalVariable);
			}
		});
		tr.start();
	}

}
