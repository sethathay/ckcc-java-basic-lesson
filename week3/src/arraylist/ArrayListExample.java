package arraylist;

import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Evan");
		list.add("Eugene");
		list.add("Adam");
		
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		list.set(0, "Goodbye");
		list.remove(1);
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		for(String s:list) {
			System.out.println(s);
		}
	}

}
