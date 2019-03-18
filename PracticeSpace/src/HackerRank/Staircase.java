package HackerRank;

public class Staircase {
	
	public static void main(String[] args) {
		
		int n = 6;
		
		for (int i=n; i>0; i--) {
			
			for(int j=0; j<i-1; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=n-i; j++){
				System.out.print("#");
			}
			System.out.println("");
		}
	}

}
