package collections.java;

public class BestPracticesOnString {

	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer("Sravan");
		System.out.println(buf.reverse());
		
		StringBuilder strb= new StringBuilder("Sravan");
		System.out.println(strb.reverse());
		
		String s1 = "This" + "ra";
		String s2 = "This" + "ra";
		
		System.out.println(s1==s2);
		
//		BestPracticesOnString.staticClass st = new BestPracticesOnString.staticClass();
//		st.test();
//		
	}
	
	static int num=999;
	
	static class  staticClass{
//		num=11;
		public void test(){
//			BestPracticesOnString bf = new BestPracticesOnString();
			num=999;
			System.out.println("Static Inner class"+num);
		}
	}
}
