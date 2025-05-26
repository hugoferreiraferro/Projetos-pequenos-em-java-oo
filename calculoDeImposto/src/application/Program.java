package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.LegalPerson;
import entites.NaturalPerson;
import entites.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		List<Person> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			System.out.print("Individual or company? ");
			char ch = sc.next().charAt(0);
			
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				NaturalPerson naturalPerson = new NaturalPerson(name,anualIncome, healthExpenditures);
				list.add(naturalPerson);
			}
			else if (ch == 'c') {
				System.out.print("number of employees: ");
				int numberOfEmployees = sc.nextInt();
				LegalPerson legalPerson = new LegalPerson(name, anualIncome, numberOfEmployees);
				list.add(legalPerson);
			}
			else {
				System.out.println("please enter a valid character");
			}
		}
		
		System.out.println("TAXES PAID: ");
		for (Person p : list) {
			System.out.println(p.getName() + ": $" + String.format("%.2f", p.tax()) + "\n");
		}
		
		double sum = 0;
		for (Person p : list) {
			sum += p.tax();
		}
		
		System.out.println("TOTAL PAXES: " + String.format("%.2f", sum));
		
		
		sc.close();
	}

}
