package statickeyword;

public class SheepTrail {
	
	public static void main(String[] args) {
		// create Sheep instances
        Sheep alfred = new Sheep(1);
        Sheep bob = new Sheep(2);
        Sheep clara = new Sheep(3);
        Sheep dave = new Sheep(4);
        
        // check total number of sheep
  	   	// note that this is a class method, not an object method.
        System.out.println("Total number of sheep is " + Sheep.countAll());
        // check which pen dave is in then move him to another pen
        System.out.println("dave is in pen " + dave.find());
        dave.moveTo(5);
        System.out.println("moving dave ...");
        System.out.println("dave is now in pen " + dave.find());
	}

}
