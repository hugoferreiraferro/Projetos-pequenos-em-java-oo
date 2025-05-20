package application;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

import entites.Costumer;
import entites.Reservation;
import entites.Room;
import entites.enums.OrderRoom;

public class Booking {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Hello, what is the name of the person booking the room?");
		String name = sc.nextLine();

		System.out.print("Please add the customer's CPF"); 
		String cpf = sc.nextLine();
		while (cpf.length() != 11) { //valida o número de caracteres
				System.out.println("Invalid CPF please try again");
				cpf = sc.nextLine();
			}
		Costumer costumer = new Costumer(name, cpf);
		
		System.out.println("Choose the room type");
		System.out.println("Choose between a simple room, a luxurious room or a suite all your own");
		OrderRoom roomType = OrderRoom.valueOf(sc.next().toUpperCase());
		
		
		System.out.println("Choose one of the rooms, we have 10 rooms available for you");
		int numberForRoom = sc.nextInt();
		
		Room room = new Room(numberForRoom, roomType);
		
		System.out.println("How many nights do you intend to spend?");
		int numberForNight = sc.nextInt();
		LocalDate day = LocalDate.now();
		
		Reservation reservation = new Reservation(numberForNight, day, room, costumer);
		
		System.out.println(reservation);

		sc.close();

}
}
