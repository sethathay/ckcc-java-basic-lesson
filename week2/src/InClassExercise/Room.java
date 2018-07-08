package InClassExercise;

public class Room {
	
	String roomNumber;
	// Room Type: Single, Double, Triple
	String roomType;
	// True: room is busy
	// False: room is free
	boolean status;
	double price;

	Room(){
		roomNumber = "102";
		roomType = "Double";
		status = false;
		price = 30;
	}
	
	Room(String rNumber){
		roomNumber = rNumber;
	}
	
	Room(String rNumber, String rType, boolean rStatus, double rPrice){
		roomNumber = rNumber;
		roomType = rType;
		status = rStatus;
		price = rPrice;
	}
	
	void checkStatusOfRoom() {
		if(status == true) {
			System.out.println("Room " + roomNumber + " is busy!!!");
		} else {
			System.out.println("Room " + roomNumber + " is free!!!");
		}
	}
}
