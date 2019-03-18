package HackerRank;

import java.util.StringTokenizer;

public class TimeConversion {
	
	public static void main(String[] args) {
		
//		String str = "07:05:45PM";
		String str = "06:40:03AM";
		StringBuilder strBuilder = new StringBuilder();
    	StringTokenizer strToken = new StringTokenizer(str, ":");
    	Integer firstToken = 0;
    	Boolean isPM = Boolean.FALSE;
    	int count = 1;
    	String secondsStr = "";
    	String minutesStr = "";
    	String hoursStr = "";
    	
    	while(strToken.hasMoreTokens()) {
    		if(count == 1) {
    			hoursStr = strToken.nextToken();
    			firstToken = Integer.parseInt(hoursStr);
    		} else {
    			String temp = strToken.nextToken();
    			if(temp.contains("PM")) {
    				isPM = Boolean.TRUE;
    				secondsStr = temp;
    			} else if (temp.contains("AM")) {
                    secondsStr = temp;
                } else {
    				minutesStr = temp;
    			}
    		}
    		count++;
    	}
    	
    	if(firstToken == 12 && !isPM) {
    		strBuilder.append("00");
    	} else if (firstToken < 12 && isPM) {
    		firstToken+=12;
    		strBuilder.append(firstToken);
    	} else {
    		strBuilder.append(hoursStr);
    	}
    	strBuilder.append(":").append(minutesStr).append(":");
    	
	    secondsStr = secondsStr.replace("PM", "");
	    secondsStr = secondsStr.replace("AM", "");
	    
	    strBuilder.append(secondsStr);
	    
    	System.out.println(strBuilder.toString());
    	
	}

}
