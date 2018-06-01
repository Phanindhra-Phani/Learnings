package generics;

import java.util.ArrayList;
import java.util.List;

public class BasicGenericsSample {

	public static void main(String[] args) {
		
		List<Object> l= new ArrayList<Object>();
		
		List<? extends String> str = new ArrayList<String>();
		
		List<? super String> strSuper = new ArrayList<String>();

		
		strSuper.add("123");
		
		l.add(new Object());
		
		BasicGenericsSample baseBasicGenericsSample = new BasicGenericsSample();
		
		baseBasicGenericsSample.test(l);

	}
	
	public void test(List<? super SuperClass> e)
	{
		e.add(new BaseClass());
		System.out.println(e.get(0)+"  "+e.get(1));
	}

}
