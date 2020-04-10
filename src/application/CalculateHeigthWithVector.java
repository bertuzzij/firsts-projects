package application;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Locale;
import java.util.Scanner;

public class CalculateHeigthWithVector {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.printf("Insert number of persons for insert the height: ");
        int n = scan.nextInt();
        double[] vect = new double[n];

        System.out.print("Insert the height for "+n+" persons: ");
        for (int i = 0; i < n; i++){ //enquanto 'i' for menor que 'n', a variável 'vect' irá alocar os valores recebidos dentr do vetor
            vect[i] = scan.nextDouble(); //leitura dos valores do vetor
        }

        double sum = 0.0;
        for (int i = 0;i < n;i++){
            sum += vect[i]; //irá percorrer o vetor e armazenar a soma de todos os valores na variável 'sum'
        }

        double avg = sum / n; //divide o total dos valores somados 'sum' por 'n' casas do vetor e atribui a média 'avg'
        System.out.printf("AVERAGE HEIGTH: %.2f", avg);
        scan.close();
    }
}
