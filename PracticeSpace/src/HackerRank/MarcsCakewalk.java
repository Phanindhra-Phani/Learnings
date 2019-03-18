package HackerRank;

public class MarcsCakewalk {

	public static void main(String[] args) {

//		int[] arr = {7, 4, 9, 6};
		int[] arr = {1, 3, 2};
		
		int size = arr.length;
		
		long sum = 0;
		
		for (int i = 0; i < size; i++) {
			for(int j = i; j < size; j++) {
				
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < size; i++) {
			
			System.out.println(arr[i]);
			sum+=((Math.pow(2,i))*arr[i]);
		}
		
		System.out.println(sum);
	}
}
