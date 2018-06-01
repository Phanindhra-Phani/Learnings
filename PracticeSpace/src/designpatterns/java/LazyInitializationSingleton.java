package designpatterns.java;

public class LazyInitializationSingleton {

	private static volatile LazyInitializationSingleton lazyInitializationSingleton = null;
	
	private LazyInitializationSingleton(){
	}

	public static LazyInitializationSingleton getInstance(){
		if(lazyInitializationSingleton==null){
			synchronized (LazyInitializationSingleton.class) {
				if(lazyInitializationSingleton==null){
					lazyInitializationSingleton = new LazyInitializationSingleton();
				}
			}
		}
		
		return lazyInitializationSingleton;
	}
}
