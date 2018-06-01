package core.java;

public class InsertionSort {
	
	public static void main(String[] args) {
		int[] input = {24,2,45,20,56,75,2,56,99,53,12};
		insertionSort(input);
	}
	
	public static void insertionSort(int[] in){
		
		for(int i=1; i<in.length; i++){
			int element = in[i];
			int j=i;
			
			while(j>0 && in[j-1]>element){
				in[j]=in[j-1];
				j--;
			}
			in[j] = element;
		}
		
		for (int i = 0; i < in.length; i++) {
			System.out.println(in[i]);
		}
	}

}
