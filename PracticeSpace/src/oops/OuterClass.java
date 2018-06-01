package oops;

public class OuterClass {
	
	
	abstract class InnerClass {
		
		public abstract void generate();
		
		public void sys(){
			System.out.println("Jboss configuration");
		}
	}
	
	class InnerInnerClass extends InnerClass{

		@Override
		public void generate() {
			System.out.println("In InnerInnerClass");
			
		}
		
	}

}
