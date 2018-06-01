package core.java;

public class ArmstrongNumberExample {
	
	public static void main(String[] args) {
		
		int rem, sum=0, temp;
		int n=153;
		temp = n;

		while(n>0){
			rem = n%10;
			sum = (rem*rem*rem)+sum;
			n=n/10;
		}
		
		if(sum == temp)
			System.out.println(temp + " is an Armstrong number");
		else
			System.out.println(temp + " is not an Armstrong number");
	}

}
