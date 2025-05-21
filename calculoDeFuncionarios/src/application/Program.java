package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.Employee;
import entites.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employee = new ArrayList<Employee>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Employee " + "#" + (i+1) + " data: " );
			System.out.print("Outsourced? (y/n) ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value for hours: ");
			double valueForHours = sc.nextDouble();
			
			if(ch == 'y') {
				System.out.print("Additional charge: ");
				double  additionalCharge = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valueForHours, additionalCharge); 
				employee.add(emp);
			}
			else {
				Employee emp = new Employee(name, hours, valueForHours);
				employee.add(emp);
			}
			
		}
		
		System.out.println();
		
		System.out.println("Payment: ");
		
		for (Employee emp : employee) {
			System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
		}
		
		
		
		sc.close();

	}

}
