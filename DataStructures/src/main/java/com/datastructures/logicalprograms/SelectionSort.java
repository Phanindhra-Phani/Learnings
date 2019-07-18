package com.datastructures.logicalprograms;

public class SelectionSort {
	
	public static void main(String[] args) {
		int[] input = {24,2,45,20,56};
		selectionSort(input);
	}


	public static void selectionSort(int[] input) {

		for (int i = 0; i <= input.length - 1; i++) {

			int iMin = i;

			for (int j = i + 1; j <= input.length - 1; j++) {
				if(input[j] < input[iMin]) {
					iMin = j;
				}
			}
			int temp = input[i];
			input[i] = input[iMin];
			input[iMin] = temp;
		}
		
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
	}

}
