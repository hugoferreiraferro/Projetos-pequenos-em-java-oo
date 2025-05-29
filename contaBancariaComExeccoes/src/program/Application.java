package program;

import java.util.Locale;
import java.util.Scanner;

import model.entites.Account;
import model.execptions.DomainExecption;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();

		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();

		System.out.print("Initial balance: ");
		double initialBalance = sc.nextDouble();
		
		System.out.print("Withdraw limite: ");
		double withdrawLimit = sc.nextDouble();
		
		Account account = new Account(number, holder, initialBalance, withdrawLimit);
		
		System.out.print("Enter ammount for withdraw: ");
		double ammount = sc.nextDouble();
		
		account.withdraw(ammount);
		}
		catch(DomainExecption e){
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println();
			System.out.println("End of program");
		}

		sc.close();

	}

}
