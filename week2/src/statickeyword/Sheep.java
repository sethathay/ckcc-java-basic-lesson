package statickeyword;

public class Sheep {
	//each sheep is kept in a pen for which the number is
	int penNumber;
	// total number of sheep created from this class
	static int totalSheep = 0;
	// sheep constructor
	public Sheep(int n) {
		penNumber = n;
		totalSheep++;
	}
	// find which pen a sheep is in
	public int find() {
		return penNumber;
	}
	// move sheep to another pen
	public void moveTo(int differentPen) {
		penNumber = differentPen;
	}
	//Count all sheep
	public static int countAll() {
		return totalSheep;
	}
}
