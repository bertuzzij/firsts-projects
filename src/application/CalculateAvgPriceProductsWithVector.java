package application;

import entities.ProductNew;

import java.util.Locale;
import java.util.Scanner;

public class CalculateAvgPriceProductsWithVector {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.printf("Quantos dados serão recebidos? ");
        int n= scan.nextInt();

        ProductNew[] vect = new ProductNew[n];//instacia o vetor com a classe para ser utilizado seus atributos

        for (int i = 0; i < vect.length; i++){
            scan.nextLine();
            String name = scan.nextLine();
            double price = scan.nextDouble();
            vect[i] = new ProductNew(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++){
            sum += vect[i].getPrice(); //soma os valores do vetor a partir do 'price'(.getPrice)
        }

        double avg = sum / n;

        System.out.printf("AVERAGE PRICE = %.2f%n", avg);

        scan.close();
    }
}
