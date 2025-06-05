package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.driver.Driver;
import model.trip.Trip;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Trip trip = new Trip();

		System.out.println("Are you an employee or a passenger? Employee: 1 passanger: 2");
		int number = sc.nextInt();

		number = checkLogin(number, sc);

		while (number != 0) {
			while (number == 1) {
				System.out.println("--- Employee Menu --- \n" + "1. Register new employee\n" + "2.List employees\n"
						+ "3.To go out");
				number = sc.nextInt();
				sc.nextLine();
				switch (number) {
				case 1: {
					System.out.print("Enter the employee's name: ");
					String name = sc.nextLine();
					System.out.print("Login with registratio: ");
					String registration = sc.nextLine();
					Driver driver = new Driver(name, registration);
					trip.addEmployee(driver);
					break;
				}
				case 2: {
					System.out.println("List employees: ");
					for (Driver d : trip.getDriver()) {
						System.out
								.println("Name: " + d.getName() + "\n" + "Registration: " + d.getRegistration() + "\n");
					}
					number = 1;
					break;
				}

				case 3: {
					number = 0;
					break;
				}
				default: {
					System.out.println("Invalid option");
					number = 1;
				}

				}

			}
			while (number ==2) {
				
			}

		}

		sc.close();
	}

	public static int checkLogin(int number, Scanner sc) {
		sc.nextLine();
		switch (number) {
		case 1: {
			String login = "admin";
			String password = "123456789";
			System.out.print("Login: ");
			String name = sc.nextLine();
			System.out.print("Senha: ");
			String senha = sc.nextLine();

			while (true) {
				if (name.equalsIgnoreCase(login) && senha.equals(password)) {
					System.out.println("Entered");
					return 1;
				}
				System.out.println("Acess denied");

				System.out.print("Login: ");
				name = sc.nextLine();
				System.out.print("Senha: ");
				senha = sc.nextLine();
			}

		}
		case 2: {

			return 2;

		}

		}
		return 0;
	}

}
