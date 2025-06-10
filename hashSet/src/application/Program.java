package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();

		System.out.print("How many students for course A?");
		int quantity = sc.nextInt();

		for (int i = 0; i < quantity; i++) {
			int codeStudents = sc.nextInt();

			a.add(codeStudents);
		}

		System.out.print("How many students for course B?");
		quantity = sc.nextInt();

		for (int i = 0; i < quantity; i++) {
			int codeStudents = sc.nextInt();

			a.add(codeStudents);
		}

		System.out.print("How many students for course C?");
		quantity = sc.nextInt();

		for (int i = 0; i < quantity; i++) {
			int codeStudents = sc.nextInt();

			a.add(codeStudents);
		}

		Set<Integer> allStudents = new HashSet<Integer>(a);

		allStudents.addAll(b);
		allStudents.addAll(c);

		System.out.println(allStudents.size());

		sc.close();
	}

}
