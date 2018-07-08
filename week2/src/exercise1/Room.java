package exercise1;

public class Room {
	
	int roomNo;
	// Room Type: Single Double Triple
	String roomType;
	boolean isCheckedIn;
	double price;
	// Constructor of Room
	Room(int guestRoomNo, String guestRoomType, boolean isRoomCheckedIn, double roomPrice){
		roomNo = guestRoomNo;
		roomType = guestRoomType;
		isCheckedIn = isRoomCheckedIn;
		price = roomPrice;
	}
	
	void checkRoomStatus() {
		if(isCheckedIn) {
			System.out.println("This room no : " + roomNo + " is currently checked in.");
		} else {
			System.out.println("This room no : " + roomNo + " is currently free.");
		}
	}
	
	void getNumberOfBeds() {
		switch(roomType) {
			case "Single" :
				System.out.println("This room no : " + roomNo + " has one bed room.");
				break;
			case "Double" :
				System.out.println("This room no : " + roomNo + " has two bed rooms.");
				break;
			case "Triple" :
				System.out.println("This room no : " + roomNo + " has three bed rooms.");
				break;
			default :
				break;
		}
	}
	
	double getRoomPrice() {
		return price;
	}
	
	void changeRoomType(String rType) {
		roomType = rType;
	}

}
