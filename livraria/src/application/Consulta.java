package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entites.Book;
import entites.Read;
import entites.enums.Gender;

public class Consulta {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Hello, please add your name, email and CPF");
		String name = sc.nextLine();
		String email = sc.nextLine();
		String cpf = sc.nextLine();
		
		while (cpf.length() != 11) { //valida o número de caracteres
			System.out.println("Invalid CPF please try again");
			cpf = sc.nextLine();
		}
		
		Read read = new Read(name, cpf, email);
		
		System.out.println("Have you ever borrowed any books?");
		String chouce = sc.nextLine();
		
		int i = 0;
		
		while(i < 1) {
		if ("yes".equalsIgnoreCase(chouce)) { //Muito legal, não sabia desse método equalsIgnoreCase
			System.out.println("enter the date of the last book you picked up (format: \"dd/MM/yyyy)");
			Date WithDrawaIDate = sdf.parse(sc.next()); //adicioanr a data e depois calcular o tempo da retirada e o dia atual
			i++;
		}
		else if ("no".equalsIgnoreCase(chouce)) {
			System.out.println("thanks for being honest with my simple system");
			i++;
		}
		else {
			System.out.println("Please write yes or no");
			chouce = sc.nextLine();
		}
		}
		
		System.out.println("Choose the genre (adventure, fiction, horror)");
		Gender gender = Gender.valueOf(sc.next().toUpperCase());
		
		System.out.println("How many copies do you want?");
		int copies = sc.nextInt();
		
		Book book = new Book(gender, copies, read);
		
		
		System.out.println("We are a simple bookstore that aims to include more books for young people, "
				+ "so we target cheap books, "
				+ "so we standardize prices at $80.00,"
				+ " and here is your purchase data:");
		
		System.out.println(book);
		
		sc.close();

	}

}
