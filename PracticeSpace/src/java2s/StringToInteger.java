package java2s;

import java.util.HashMap;

public class StringToInteger {
	
	HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
	
	private void m1() {
//		m2();
	}
	
	class InnerClass {
		private void m2() {
			m1();
		}
	}

}
