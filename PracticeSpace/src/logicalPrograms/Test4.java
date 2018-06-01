package logicalPrograms;

import java.util.Scanner;

public final class Test4 {
    class Inner {
            void test() {
                    if (Test4.this.flag); {
                            sample();
                    }
            }
    }
    private boolean flag = true;
    public void sample() {
            System.out.println("Sample");
    }
    public Test4() {
            (new Inner()).test();
    }
    public static void main(String args []) {
//            new Test4();
    	
//    	Scanner sc = new Scanner(System.in);
//    	int num1 = sc.nextInt();
//    	int num2 = sc.nextInt();
//    	
//    	int[] i = {1,2,3};
//    	
//    	
//    	
//    	sc.close();
    	
    	computeHours();
    	
    }
    
     static void computeHours(){
    	 
    	 String s = "1015";
    	 int hours = Integer.parseInt(s.substring(0, 2));
    	 int minutes = Integer.parseInt(s.substring(2));
    	 
    	 if(hours>12){
    		 hours = hours-12;
    	 }
    	
    	 System.out.println((long)(hours*30+Math.floor(minutes*0.5))+":"+(minutes*6));
    }
}
