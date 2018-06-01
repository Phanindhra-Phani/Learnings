package core.java;

public class PascalsTriangle {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5-i; j++) {
				System.out.print(" ");
			}
			int num = 1;
			for (int j = 0; j <=i; j++) {
				System.out.print(num+" ");
				num = num * (i-j)/(j+1);
			}
			System.out.println();
		}
	}

}
