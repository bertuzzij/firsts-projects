package application;

import entities.Products;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaPedidoEstoque {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
            Products product = new Products();

            System.out.printf("Enter product data: ");
            System.out.printf("Name: ");
            product.name = scan.nextLine();

            System.out.printf("Price: ");
            product.price = scan.nextDouble();

            System.out.printf("Quantity in stock: ");
            product.quantity = scan.nextInt();

            System.out.printf("Product data: " + product);
            System.out.println();
            System.out.printf("Enter the number of products to be added in stock: ");
            int quantity = scan.nextInt();
            product.addProducts(quantity);//método que atualiza o valor do objeto 'Products' com o valor de 'int quantity'

            System.out.println();
            System.out.printf("Updated data: " + product);

            System.out.println();
            System.out.printf("Enter the number of products to be removed from stock: ");
            quantity = scan.nextInt();
            product.removeProducts(quantity);//método que atualiza o valor do objeto 'Products' com o valor de 'int quantity'

            System.out.println();
            System.out.printf("Updated data: " + product);

        scan.close();
    }


}
