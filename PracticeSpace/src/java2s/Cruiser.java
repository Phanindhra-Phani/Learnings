package java2s;

public class Cruiser implements Runnable {
    
	public static void main(String[] args) throws InterruptedException {
        Thread a = new Thread(new Cruiser());
        
        a.run();
        a.run();
        a.start();
        
        System.out.print("Begin");
        a.join();
        System.out.print("End");
    }
    
    public void run() {
        System.out.print("Run");
    }
}