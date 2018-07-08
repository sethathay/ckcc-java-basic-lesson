package InClassExercise;

import java.util.Scanner;

public class GuestHouse {
	
	public static void main(String[] args) {
		
		/*Room roomObj1 = new Room();
		roomObj1.checkStatusOfRoom();
		
		Room roomObj2 = new Room();
		roomObj2.checkStatusOfRoom();
		
		Room roomObj3 = new Room("103");
		System.out.println("Your new room number is " + roomObj3.roomNumber);
		roomObj3.checkStatusOfRoom();
		
		Room roomObj4 = new Room("104", "Triple", true, 60);
		System.out.println("Room Number: " + roomObj4.roomNumber);
		roomObj4.roomNumber = "105";
		roomObj4.checkStatusOfRoom();*/
		
		// Using Scanner to get input from keyboard
		System.out.println("How many room does your guesthouse have???");
		Scanner sc = new Scanner(System.in);
		int numberOfRoom = sc.nextInt();
		Room[] rooms = new Room[numberOfRoom];
		for(int i = 0; i < numberOfRoom; i++) {
			System.out.println("Enter Room Number:");
			String rNumber = sc.next();
			System.out.println("Enter Room Type:");
			String rType = sc.next();
			System.out.println("Enter Room Status:");
			boolean rStatus = sc.nextBoolean();
			System.out.println("Enter Room Price:");
			double rPrice = sc.nextDouble();
			Room rObj = new Room(rNumber, rType, rStatus, rPrice);
			rooms[i] = rObj;
		}
		
		// Read from Array
		for(int i = 0; i < numberOfRoom; i++) {
			Room rObj = rooms[i];
			rObj.checkStatusOfRoom();
		}
		sc.close();
	}

}
