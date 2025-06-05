package pages;

import java.util.Scanner;

import model.entities.driver.DriveSubway;
import model.entities.driver.Driver;
import model.entities.driver.DriverBus;
import model.entities.driver.DriversTypes;
import model.trip.Trip;

public class Employee {
	private Trip trip;

	public Employee(Trip trip) {
		this.trip = trip;
	}

	public int pageEmployee(int number, Scanner sc) {
		while (number == 1) {
			System.out.println(
					"--- Employee Menu --- \n" + "1. Register new employee\n" + "2.List employees\n" + "3.To go out");
			number = sc.nextInt();
			sc.nextLine();

			switch (number) {
			case 1: {
				System.out.print("Enter the employee's name: ");
				String name = sc.nextLine();
				System.out.print("Login with registratio: ");
				String registration = sc.nextLine();
				System.out.println("Bus or subway driver? 1 = Bus, 2 = Subway");
				int select = sc.nextInt();
				sc.nextLine();
				if (select == 1) {
					System.out.println("Enter the line route");
					String line = sc.nextLine();
					System.out.println("Enter the route type (municipal, intercity, interstate)");
					DriversTypes types = DriversTypes.valueOf(sc.next().toUpperCase());
					DriverBus driverBus = new DriverBus(name, registration, line, types);
					trip.addEmployee(driverBus);

				} else if (select == 2) {
					System.out.println("Enter the metro stations");
					String stations = sc.nextLine();
					DriveSubway drive = new DriveSubway(name, registration, stations);
					trip.addEmployee(drive);

				} else {
					System.out.println("Invalid option");
				}
				break;
			}
			case 2: {
				System.out.println("List employees: ");
				for (Driver d : trip.getDriver()) {
					System.out.println(d.driverDetails());
				}
				number = 1;
				break;
			}

			case 3: {
				number = 3;
				return number;

			}
			default: {
				System.out.println("Invalid option");
				number = 1;
			}

			}
		}

		return 0;
	}

}
