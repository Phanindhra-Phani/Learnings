package core.java;

public class PrimeNumberExample {
	
	public static int primeNumber(int value, int defaultTwo){
		
		if(value > defaultTwo){
			
			if(value%defaultTwo!=0){
				return (primeNumber(value, ++defaultTwo));
			}else{
				return 0;
			}
			
		}
		return 1;
	}
	
	public static void main(String[] args) {
		
		for(int i = 1; i<20; i++ ){
			int prime = primeNumber(i, 2);
			if(prime==1){
				System.out.println(i +" is a prime number");
			}else{
				System.out.println(i +" is not a prime number");
			}
		}
	}

}
