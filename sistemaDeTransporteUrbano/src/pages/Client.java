package pages;

import java.util.Scanner;

import model.services.BikeTransport;
import model.services.BusTransport;
import model.services.Subway;
import model.trip.TravelOfReport;
import model.trip.Trip;
import model.trip.addData;

public class Client {
	public Client() {
	}

	TravelOfReport travel = new TravelOfReport();
	Trip trip = new Trip();

	public void clientPage(int number, Scanner sc) {
		while (number == 2) {
			System.out.println("Transport options:" + "\n" + "1 - bus - 4.50$" + "\n" + "2 - subway - 7.50$" + "\n"
					+ "3 - bile - 0.50 for KMs" + "\n" + "4 - travel report" + "\n"+ "5 - close");
			number = sc.nextInt();
			switch (number) {
			case 1: {
				System.out.println();
				System.out.print("How many tickets will there be: ");
				int tickets = sc.nextInt();
				System.out.print("How many kms are you on your trip: ");
				int kms = sc.nextInt();
				addData data = new addData(new BusTransport(), trip);
				data.addingDateToTrip(kms, tickets);
				number = 2;
				break;
			}
			case 2: {
				System.out.println();
				System.out.print("How many tickets will there be? ");
				int tickets = sc.nextInt();
				System.out.print("How many kms are you on your trip? ");
				int kms = sc.nextInt();
				addData data = new addData(new Subway(), trip);
				data.addingDateToTrip(kms, tickets);
				number = 2;
				break;
			}

			case 3: {
				System.out.println();
				System.out.print("How many bikes do you want to rent? ");
				int tickets = sc.nextInt();
				System.out.print("How many kms are you on your trip? ");
				int kms = sc.nextInt();
				addData data = new addData(new BikeTransport(), trip);
				data.addingDateToTrip(kms, number);
				number = 2;
				break;
			}
			case 4: {
				System.out.println("report of your trip:");
				System.out.println(trip.generateReport());
				number = 2;
				break;
			}
			case 5: {
				number = 3;
				break;
			}
			}
		}

	}
}
