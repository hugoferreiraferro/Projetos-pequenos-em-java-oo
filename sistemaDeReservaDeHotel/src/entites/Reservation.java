package entites;

import java.time.LocalDate;

import entites.enums.OrderRoom;

public class Reservation {
	private Integer numberForNight;
	private LocalDate date;
	
	private Room room;
	private Costumer costumer;
	
	public Reservation() {}
	public Reservation(Integer numberForNight, LocalDate date, Room room, Costumer costumer) {
		this.numberForNight = numberForNight;
		this.date = date;
		this.room = room;
		this.costumer = costumer;
	}
	public Integer getNumberForNight() {
		return numberForNight;
	}
	public void setNumberForNight(Integer numberForNight) {
		this.numberForNight = numberForNight;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public Costumer getCostumer() {
		return costumer;
	}
	public void setCostumer(Costumer costumer) {
		this.costumer = costumer;
	}
	
	public Double total() {
		if (room.getRoomType() == OrderRoom.SIMPLE) {
			return numberForNight * 418.00;
		}
		else if (room.getRoomType() == OrderRoom.LUXURY) {
			return numberForNight * 900.00;
		}
		else if (room.getRoomType() == OrderRoom.SUITE) {
			return numberForNight * 1500.00;
		}
		return null;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name: ");
		sb.append(costumer.getName() + "\n");
		sb.append("CPF: ");
		sb.append(costumer.getCpf() + "\n");
		sb.append("Reservation type: ");
		sb.append(room.getRoomType() + "\n");
		sb.append("Room number: ");
		sb.append(room.getRoomNumber() + "\n");
		sb.append("Total price: ");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
		
	}

}
