package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class ProgramN {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle(); //instanciando o objeto para que ele exista e possa ser utilizado
        y = new Triangle(); //instanciando o objeto para que ele exista e possa ser utilizado

        System.out.println("Enter the measures of triangle X: ");
        x.a = scan.nextDouble();
        x.b = scan.nextDouble();
        x.c = scan.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = scan.nextDouble();
        y.b = scan.nextDouble();
        y.c = scan.nextDouble();

        double areaX = x.area(); // chamada do método que irá calcular a área dos dados informados no x
        double areaY = y.area(); // chamada do método que irá calcular a área dos dados informados no y

        System.out.printf("Triangle area X: %.4f%n");
        System.out.printf("Triangle area Y: %.4f%n");

        if (areaX > areaY) {
            System.out.println("Larger triangle X");
        } else {
            System.out.println("Larger triangle Y");
        }

        scan.close();
    }
}
