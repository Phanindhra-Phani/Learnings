package saptient.onlinetest;

public class IncrementOperator {
	
	public static void main(String[] args) {
		
		int i = 0;
		while(true) {
			if(i++ == 4) {
				break;
			}
			++i;
		}
		
		System.out.println("i="+(i++));
	}

}
