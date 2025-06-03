package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.contract.entites.Contract;
import model.contract.entites.Installment;
import model.contract.services.ContractServices;
import model.contract.services.PaypalService;

public class Program {

	public static void main(String[] args) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre os dados do contrato: ");
		System.out.print("Número: ");
		int number = sc.nextInt();
		System.out.println("Data: (dd/MM/yyyy)");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		Double totalValue = sc.nextDouble();
		System.out.print("Entre com o número de parcelas: ");
		int dueDate = sc.nextInt();
		
		Contract contrac = new Contract(number, date, totalValue);
		
		ContractServices contractServices = new ContractServices(new PaypalService()); 
		contractServices.processContract(contrac,  dueDate);
		
		
		for(Installment installment : contrac.getInstallment()) {
			System.out.println(installment.toString());
		}
		sc.close();

	}

}
