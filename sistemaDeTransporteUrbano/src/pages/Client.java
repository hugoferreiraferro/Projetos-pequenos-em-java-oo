package pages;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Client {
	public Client() {
	}

	public void clientPage(int number, Scanner sc) {
		System.out.println("Transport options:" + "\n" + "1 - bus - 4.50$" + "\n" + "2 - subway - 7.50$" + "\n"
				+ "3 - bile - 0.50 for KMs");
		number = sc.nextInt();
		switch (number) {
		case 1: {
			System.out.println();
			System.out.println("How many tickets will there be?");
			int tickets = sc.nextInt();
			System.out.println("How many kms are you on your trip?");
			int kms = sc.nextInt();
			
		}
	}

}
}
