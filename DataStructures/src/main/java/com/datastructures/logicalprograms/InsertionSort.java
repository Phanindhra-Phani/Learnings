package com.datastructures.logicalprograms;

/*
 * Reference : https://www.youtube.com/watch?v=i-SKeOcBwko
 * 
 * https://www.youtube.com/watch?v=pkkFqlG0Hds&list=PL2_aWCzGMAwKedT2KfDMB9YA5DgASZb3U&index=2&t=0s
 */
public class InsertionSort {
	
	public static void main(String[] args) {
		int[] input = {24,2,45,20,56,75,2,56,99,53,12};
		insertionSort(input);
	}

	public static void insertionSort(int[] input) {

		for (int i = 1; i <= input.length - 1; i++) {

			int value = input[i]; 
			int hole = i;

			while (hole > 0 && input[hole - 1] > value) {
				input[hole] = input[hole - 1];
				hole = hole - 1;
			}
			input[hole] = value;
		}

		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
		
	}

}
