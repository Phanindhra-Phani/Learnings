package legato.interview;

public class RemoveAllWhiteSpaces {
	
	public static void main(String[] args) {
	
		String str = "My name is Sravan Kumar	 Pala";
		String strWithoutSpace  = str.replaceAll("\\s", "");
		
		System.out.println(strWithoutSpace);
		
		//Without using replaceAll()
		char[] strArray = str.toCharArray();
		StringBuilder strBuilder = new StringBuilder();
		for (char c : strArray) {
			if(c!=' ' && c!='\t'){
				strBuilder.append(c);
			}
		}
		System.out.println(strBuilder.toString());
		
	}

}
