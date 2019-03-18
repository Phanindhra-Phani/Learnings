package java2s;

public class Creature {
    private int legCount;
    protected int wingCount;
    
    public Creature(int legCount) {
        this.legCount = this.legCount;
        this.wingCount = 0;
    }
    
    public String toString() {
        return "legs=" + this.legCount + " wings=" + wingCount;
    }
}

 class Animal extends Creature {
	
    public Animal(int legCount) {
    	
    	super(legCount);
    	super.wingCount = 0;
    }

}