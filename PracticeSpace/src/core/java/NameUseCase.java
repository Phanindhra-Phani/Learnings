package core.java;

public class NameUseCase {
	
	
	public static void main(String[] args) {
		
		String name = "abc bcd efg hij klm";
		StringBuffer buffer = new StringBuffer();
		String arr[]=name.split(" ");
		for(int count = 0; count < arr.length; count++){
		if(count !=0 && count < arr.length)
		buffer.append(" ");
		buffer.append(arr[count].substring(0,1).toUpperCase().concat(arr[count].substring(1,arr[count].length()).toLowerCase()));

		}
		System.out.println(buffer.toString());
		
		
//		String name = "sravan kumar pala";
//
//		StringBuffer buff = new StringBuffer();
//
//		String[] str = name.split(" ");
//		for (String string : str) {
//
//		char[] stringArray = string.trim().toCharArray();
//		stringArray[0] =Character.toUpperCase(stringArray[0]);
//		string = new String(stringArray);
//
//		buff.append(string).append(" ");
//		}
//
//		System.out.println(buff.toString());
	}

}
