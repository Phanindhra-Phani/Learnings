package core.java;


public class MaxAndMinNumberInArray {
	
	public static void largeAndSmall(int a[]){
		
		int largest = a[0];
		int smallest = a[0];
		
		for(int i:a){
			if(i>largest){
				largest=i;
			}else if(i<smallest){
				smallest = i;
			}
		}
		System.out.println("Input array: "+ a.toString());
		System.out.println("Largest Number: "+largest);
		System.out.println("Samllest Number: "+smallest);
	}
	
	public static void main(String[] args) {
		int a[] = {443,994,404};
		
		largeAndSmall(a);
	}

}
