package HackerRank;

public class MinMaxSum {

	public static void main(String[] args) {
		
//		int[] arr = {1, 2, 3, 4, 5};
		
//		int[] arr = {256741038, 623958417, 467905213, 714532089, 938071625};//2744467344
		
		int[] arr = {140638725, 436257910, 953274816, 734065819, 362748590};//2744467344
		
		int size = arr.length;
		
		Long minimumValue = 0l;
		Long maximumValue = 0l;
		Long sum = 0l;
		
		for (int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if(i!=j) {
					sum+= arr[j];
				}
			}
			System.out.println(sum);
			
			if(i==0) {
				minimumValue = sum;
			}
			
			if(sum > maximumValue) {
				maximumValue = sum;
			} else if(sum < minimumValue) {
				minimumValue = sum;
			}
			sum = 0l;
		}
		System.out.println("Minimum value:"+ minimumValue +" Maximum value: "+maximumValue);
	}
	
}
