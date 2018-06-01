package threads.java;

public class MyThreadImplements implements Runnable{

	@Override
	public void run(){
		System.out.println("Welcome to Thread world using Runnable Interface");
		Thread thread = Thread.currentThread();
		System.out.println("Thread Name in Run method: "+thread.getName() +" :::Thread Priority:: "+thread.getPriority());
	}
}
