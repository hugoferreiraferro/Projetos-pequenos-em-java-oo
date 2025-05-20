package entites;

import entites.enums.OrderRoom;

public class Room {
	private Integer roomNumber;
	private OrderRoom roomType;
	
	public Room() {}
	
	public Room(Integer roomNumber, OrderRoom roomType) {
		this.roomNumber = roomNumber;
		this.roomType = roomType;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}


	public OrderRoom getRoomType() {
		return roomType;
	}

	public void setRoomType(OrderRoom roomType) {
		this.roomType = roomType;
	}
	
	
	
	
	
 

}
