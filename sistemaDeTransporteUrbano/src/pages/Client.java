package pages;

import java.util.Scanner;

import model.services.BusTransport;
import model.trip.TravelOfReport;
import model.trip.addData;

public class Client {
	public Client() {
	}
	TravelOfReport travel = new TravelOfReport();

	public void clientPage(int number, Scanner sc) {
		System.out.println("Transport options:" + "\n" + "1 - bus - 4.50$" + "\n" + "2 - subway - 7.50$" + "\n"
				+ "3 - bile - 0.50 for KMs");
		number = sc.nextInt();
		switch (number) {
		case 1: {
			System.out.println();
			System.out.print("How many tickets will there be? ");
			int tickets = sc.nextInt();
			System.out.print("How many kms are you on your trip? ");
			int kms = sc.nextInt();
			addData data = new addData(new BusTransport());
			data.addingDateToTrip(kms, tickets);
			
		}
	}

}
}
