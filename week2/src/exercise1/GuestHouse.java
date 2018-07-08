package exercise1;

public class GuestHouse {
	
	public static void main(String[] args) {
		
		Room room101 = new Room(101, "Single", false, 30);
		Room room102 = new Room(102, "Double", true, 60);
		Room room103 = new Room(103, "Triple", false, 80);
		
		room101.checkRoomStatus();
		
		room102.getNumberOfBeds();
		room102.changeRoomType("Triple");
		room102.getNumberOfBeds();
		
		double roomPrice = room103.getRoomPrice();
		System.out.println("The price of this room is : $" + roomPrice);
	}

}
