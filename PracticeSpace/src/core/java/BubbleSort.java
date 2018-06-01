package core.java;

public class BubbleSort {

	public static void main(String[] args) {
		
		int swap;
		int[] input = {24,2,45,20,56,75,2,56,99,53,12};
		
		for(int c=0; c<input.length-1; c++){
			for (int i = c+1; i < input.length-1; i++) {
				if(input[c]>input[i]){
					
					swap = input[c];
					input[c] = input[i];
					input[i] = swap;
					
				}
			}
		}
		
		for (int i = 0; i < input.length-1; i++) {
			System.out.println(input[i]);
		}
		
	}
	
}
