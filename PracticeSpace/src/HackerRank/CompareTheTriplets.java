package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {

	public static void main(String[] args) {
		
		List<Integer> a = new ArrayList<>();
		a.add(10);
		a.add(30);
		a.add(50);
		
		List<Integer> b = new ArrayList<>();
		b.add(40);
		b.add(30);
		b.add(10);
		
		List<Integer> returnList = new ArrayList<>();
        
        int aliceCount = 0;
        int bobCount = 0;
        
        for(int i = 0; i< a.size(); i++) {
            if(a.get(i) > b.get(i)) {
               aliceCount+=1;
            } else if (a.get(i) < b.get(i)) {
                bobCount+=1;
            }
        }
        
        returnList.add(aliceCount);
        returnList.add(bobCount);
        
        System.out.println(returnList);
	}
}
