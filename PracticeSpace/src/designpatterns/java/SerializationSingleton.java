package designpatterns.java;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SerializationSingleton implements Serializable {
	
	private static final SerializationSingleton serializationSingleton = new SerializationSingleton();
	
	private SerializationSingleton(){
	}

	private int x = 100;
	
	public static SerializationSingleton getInstance(){
		return serializationSingleton;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public Object readResolve() throws ObjectStreamException {
		return serializationSingleton;
	}
	
}
