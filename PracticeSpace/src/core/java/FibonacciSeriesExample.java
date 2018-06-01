package core.java;

public class FibonacciSeriesExample {
	
	public static void main(String[] args) {
//		fibonacciSeriesWithoutRecursion(10, 0,1);
		
		System.out.println(0+ " "+1);
		fibonacciSeriesWithRecursion(8,0,0,1);
		
	}

	public static void fibonacciSeriesWithoutRecursion(int count, int n1, int n2){
		int n3;
		System.out.println(n1+ " "+n2);
		for(int i=2; i<count; i++){
			n3 = n1+n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;
		}
		
	}
	
	public static void fibonacciSeriesWithRecursion(int count, int n3, int n1,  int n2){
		if(count>0){
			n3 = n1 + n2;
			n1=n2;
			n2=n3;
			System.out.println(" "+n3);
			fibonacciSeriesWithRecursion(count-1, n3, n1, n2);
		}
	}
}
