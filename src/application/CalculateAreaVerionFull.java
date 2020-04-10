package application;

import java.util.Locale;
import java.util.Scanner;

//AQUI FORAM FEITOS AS DELEGAÇÕES DE FUNÇÕES E EXECUÇÕES DENTRO DE UM MESMO PROJETO
public class CalculateAreaVerionFull {

    public static final double PI = 3.14459; //indica que a variável 'PI' é uma constante que não vai mudar

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = scan.nextDouble();

        double c = circumference(radius); //função circumference
        double v = volume(radius); //função volume

        System.out.printf("Circumference: %.2n", c);
        System.out.printf("Volume: %.2n", v);
        System.out.printf("PI value: %.2n",PI);

        scan.close();
    }

    //função circumference
    public static double circumference(double radius){ //esse método espera o 'radius' como argumento
        return 2 * PI * radius;
    }

    //função volume
    public static double volume(double radius){ //esse método espera o 'radius' como argumento
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
