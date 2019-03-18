package HackerRank;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		
		int[] ar = {3, 2, 1, 3};
		
		int finalNumber = 0;
		int count = 0;
		
		for (int i = 0; i < ar.length; i++) {
			if(ar[i] > finalNumber) {
				finalNumber = ar[i];
				count = 1;
			} else if (ar[i] == finalNumber) {
				count+=1;
			}
		}
		
		System.out.println(count);
	}
}
