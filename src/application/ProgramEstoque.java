package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductNew;

public class ProgramEstoque {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		ProductNew product = new ProductNew(name, price, quantity);//obriga a inser��o dos dados j� no ato da instancia��o
		
		product.setName("Notebook");//Usando o m�todo setName para alterar o valor inserido no atributo 'name'
		System.out.print("Updated name: "+product.getName());//pegando o valor do atributo name com o m�todo getName
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		sc.close();
	}
}