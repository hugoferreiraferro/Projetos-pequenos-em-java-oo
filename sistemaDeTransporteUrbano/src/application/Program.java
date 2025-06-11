package application;

import java.util.Locale;
import java.util.Scanner;

import model.trip.Trip;
import pages.Client;
import pages.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Trip trip = new Trip();
		Employee employee = new Employee(trip);
		Client client = new Client();

		System.out.println("Are you an employee or a passenger? Employee: 1 passanger: 2");
		int number = sc.nextInt();

		// checa o login e senha do funcionário
		if(number == 1) {
			number = checkLogin(number, sc);

		// chama a página customizada para o funcionário
		employee.pageEmployee(number, sc);
		}
		
		// chama a página customizada para o cliente
		if ( number == 2){
			client.clientPage(number, sc);
		}

		sc.close();
	}

	// funções
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

		}
		return 0;
	}

}
