package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.ImportedProduct;
import entites.Product;
import entites.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> product = new ArrayList<>();
		Product product1 = new Product(){};
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Product #" + (i+1) + "data: ");
			System.out.print("Commom, used or imported? (c/u/i)");
			char ch = sc.next().charAt(0);
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(ch == 'c') {
				product1 = new Product(name, price);
				product.add(product1);
			}
			else if(ch == 'u') {
				System.out.print("Manufacture date (dd/MM/yyyy):");
				Date manufactureDate =  sdf.parse(sc.next());
				product1 = new UsedProduct(name, price, manufactureDate);
				product.add(product1);
				
			}

			else if(ch == 'i') {
				System.out.print("Customs fee:");
				double imported = sc.nextDouble();	
				product1 = new ImportedProduct(name, price, imported);
				product.add(product1);
			}
		}
		
		for(Product prod : product) {
			System.out.println("Name: " + prod.getName() + "\n" + prod.priceTag() + "\n");
		}
		
		
		sc.close();

	}

}
