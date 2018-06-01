package designpatterns.java;

public class InnerClassSingleton {
	
	private InnerClassSingleton(){
	}

	private static class InnerClassForCreatingSingleton {
		private static final InnerClassSingleton INNER_CLASS_SINGLETON = new InnerClassSingleton();
	}
	
	public static InnerClassSingleton getInstance(){
		return InnerClassForCreatingSingleton.INNER_CLASS_SINGLETON;
	}
}
