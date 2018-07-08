package week3.priorityqueue;

import java.util.PriorityQueue;

public class Queue2 {
	
	public static void main(String[] args) {
		
		PriorityQueue<String> pQueue = new PriorityQueue<String>();
		
		pQueue.add("B");
		pQueue.add("C");
		pQueue.add("F");
		pQueue.add("A");
		pQueue.add("L");
		pQueue.add("D");
		pQueue.add("E");
		pQueue.add("J");
		
		System.out.println("HEAD :" + pQueue.peek());
		System.out.println("HEAD :" + pQueue.element());
		
		while(!pQueue.isEmpty()) {
			System.out.println(pQueue.poll() + "  ");
		}
		
		System.out.println("\n");
		
		pQueue.add("B");
		pQueue.add("C");
		pQueue.add("F");
		pQueue.add("A");
		pQueue.add("L");
		pQueue.add("D");
		pQueue.add("E");
		pQueue.add("J");
		
		while(!pQueue.isEmpty()) {
			System.out.println(pQueue);
System.out.println("Removed : " + pQueue.remove());
			System.out.println(pQueue);
			System.out.println();
		}
		
	}

}
