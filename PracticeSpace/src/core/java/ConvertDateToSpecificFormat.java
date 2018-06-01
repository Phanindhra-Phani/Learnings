package core.java;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertDateToSpecificFormat {

	public static void main(String[] args) throws ParseException {
		
		String str = "28/11/2016";
		
		DateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
		Date dt = sf.parse(str);
		System.out.println(dt);
		
		Date date = new Date();
		String str1 = sf.format(date);
		
		System.out.println(str1);
	}
}
