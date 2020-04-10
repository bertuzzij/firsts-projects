package application;

import utils.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class CalculateArea {

   public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter radius: ");
        double radius = scan.nextDouble();

        double c = Calculator.circumference(radius); //função circumference
        double v = Calculator.volume(radius); //função volume

        System.out.printf("Circumference: %.2n", c);
        System.out.printf("Volume: %.2n", v);
        System.out.printf("PI value: %.2n",Calculator.PI);

        scan.close();
    }


}
