package com.datastructures.logicalprograms;

public class BubbleSort {

	public static void main(String[] args) {
		int[] input = { 24, 2, 45, 20, 56, 100 };
		bubbleSort(input);
	}

	public static void bubbleSort(int[] input) {

		for (int i = 0; i <= input.length - 1; i++) {

			for (int j = 0; j <= input.length-2; j++) {

				if (input[j] > input[j + 1]) {
					int temp = input[j + 1];
					input[j + 1] = input[j];
					input[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}

	}

}
