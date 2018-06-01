package core.java;


public class MultiplyMatrixFromTerminal {
	
	public static void main(String[] args) {
		
		int m=2, n = 3, p=2;
		int count = 0;
		int count1 = 0;
		int a[][] = new int[m][n];
		int b[][] = new int[n][p];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {	
				a[i][j] = count++;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < p; j++) {	
				b[i][j] = count1++;
			}
		}
		
		int sum=0;
		int c[][]= new int[m][p];
		
		for(int i=0; i<m; i++){
			for (int j = 0; j < p; j++) {
				for (int k = 0; k < n; k++) {
					
					sum = sum+a[i][k]*b[k][j];
				}
				c[i][j] = sum;
				sum = 0;
			}
		}
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < p; j++) {
				System.out.print(c[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}

}
