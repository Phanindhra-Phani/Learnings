package core.java;

public class MatrixCreation {

	public static void main(String[] args) {
		int a[][] = new int[3][3];
		int count=0;
		
		for(int i=0; i<3; i++){
			for (int j=0; j<3; j++){
				a[i][j]=count;
				count++;
			}
		}
		
//		System.out.println(a[2][2]);
		display(a);
	}
	
	public static void display(int a[][]){
		
		for(int i = 0; i<3; i++){
			for(int j = 0; j<3; j++){
				if(j<i){
					System.out.print("\t ");
				}else{
					System.out.print(a[i][j]+"\t");	
				}
			}
			System.out.println("\n");
		}
		
	}
}
