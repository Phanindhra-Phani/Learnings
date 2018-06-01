package oops;

public class ExtendAbstractClass  {

	public static void main(String[] args) {
		OuterClass.InnerInnerClass inn = new OuterClass().new InnerInnerClass();
		inn.generate();
		inn.sys();
	}

}
