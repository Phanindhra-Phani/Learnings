package core.java;

public class AdditionMatrix {

	public static void main(String[] args) {
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int count=0;
		int count1=9;
		
		for(int i=0; i<3; i++){
			for (int j=0; j<3; j++){
				a[i][j]=count;
				count++;
			}
		}
		

		for(int i=0; i<3; i++){
			for (int j=0; j<3; j++){
				b[i][j]=count1;
				count1++;
			}
		}
		display(a);
		display(b);
		add(a,b);
	}
	
	public static void display(int a[][]){
		
		for(int i = 0; i<3; i++){
			for(int j = 0; j<3; j++){
				System.out.print(a[i][j]+"\t");	
			}
			System.out.println("\n");
		}
		System.out.println("\n");
		
	}

	public static void add(int a[][], int b[][]){
		System.out.println("\n\n");
		int c[][] = new int[3][3];
		for(int i=0; i<3; i++){
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j]+b[i][j];
			}
		}
		
		for(int i=0; i<3; i++){
			for (int j = 0; j < 3; j++) {
				System.out.print(c[i][j]+" \t");
			}
			System.out.println("\n");
		}
	}
}
