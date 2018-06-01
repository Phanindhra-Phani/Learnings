package core.java;

public class QuickSort {
	
	private int array[];
    private int length;
	
	public static void main(String[] args) {
		QuickSort sorter = new QuickSort();	
		int[] input = {24,2,45,20,56,75,2,56,99,53,12};
        sorter.sort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }
	}
	
	public void sort(int[] a){
		if(a == null || a.length == 0){
			return;
		}
		this.array = a;
		length = a.length;
		quickSort(0, length-1);
	}
	
	public void quickSort(int lowestIndex, int highestIndex){
		
		int i = lowestIndex;
		int j = highestIndex;
		
		int pivot = array[lowestIndex+(highestIndex-lowestIndex)/2];
		
		while(i<=j){
			while(array[i] < pivot){
				i++;
			}
			while(array[j]>pivot){
				j--;
			}
			if(i<=j){
				exchangeNumbers(i,j);
				i++;
				j--;
			}
		}
		if(lowestIndex < j){
			quickSort(lowestIndex, j);
		}if(i < highestIndex){
			quickSort(i, highestIndex);
		}
		
	}
	
	public void exchangeNumbers(int i, int j){
		 int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	}
}
