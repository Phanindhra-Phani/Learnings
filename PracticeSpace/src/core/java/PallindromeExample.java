package core.java;

public class PallindromeExample {

	public static void main(String[] args) {
		int temp, sum=0, rem;
		int n = 121;
		temp = n;
		
		while(n>0){
			rem = n%10;
			sum = (sum*10)+rem;
			n=n/10;
		}
		
		if(sum == temp){
			System.out.println(temp + " is a Palindrome number");
		}else{
			System.out.println(temp + " is not a Palindrome number");
		}
	}
}
