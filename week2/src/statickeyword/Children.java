package statickeyword;

public class Children {
	
	static int numberOfChildren = 0;
	
	public static void main(String[] args) {
		Children.numberOfChildren = 100;
		System.out.println(Children.numberOfChildren);
		Children ch1 = new Children();
		System.out.println(ch1.numberOfChildren);
		Children ch2 = new Children();
		System.out.println(ch2.numberOfChildren);
		Children.numberOfChildren = 2;
		System.out.println(Children.numberOfChildren);
		System.out.println(ch1.numberOfChildren);
	}

}
