package weeks.treeset;

import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(String[] args) {
		TreeSet<String> stringList = new TreeSet<String>();
		
		stringList.add("Evan");
		stringList.add("Eugene");
		stringList.add("Adam");
		
		System.out.println(stringList.size());
		System.out.println(stringList.first());
		System.out.println(stringList.last());
		System.out.println("/////////////////////////////");
		
		stringList.remove("Eugene");
		
		for(String s: stringList) {
			System.out.println(s);
		}
	}

}
