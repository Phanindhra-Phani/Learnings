package HackerRank;

import java.text.DecimalFormat;

public class PlusMinus {

	public static void main(String[] args) {
		
		int[] arr = {-4, 3, -9, 0, 4, 1};
		float positiveCount = 0;
		float negativeCount = 0;
		float zeroCount = 0;
        
        DecimalFormat df = new DecimalFormat("##.######");
        int size = arr.length;
        System.out.println(size);
         
        for (int i =0; i < size; i++) {
            if(arr[i] > 0) {
                positiveCount+=1;
            } else if(arr[i] < 0) {
                negativeCount+=1;
            } else {
                zeroCount+=1;
            }
            
        }
//        
//        float sts = (positiveCount/size);
//        
////        System.out.println(sts);
////        System.out.println(negativeCount/(arr.length));
////        System.out.println(zeroCount/(arr.length));
//        
//        System.out.println(String.format("%.6f", sts));
////        System.out.println("%.4f", zeroCount/arr.length);
//        
         System.out.println(df.format(positiveCount/arr.length));
         System.out.println(df.format(negativeCount/arr.length));
         System.out.println(df.format(zeroCount/arr.length));
		
		
//		String s1 = "Mississippi";
//		String s2 = s1;
//		s1 = s1.replace("i", "!");
//		
//		System.out.println(s1 + "," + s2 + "," + (s1==s2));
		
		
	}
}
