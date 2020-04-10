package application;

//fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na tela o valor
//de sua área, perímetro e diagonal. Usar uma classe como mostrado no projeto ao lado

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class CalculateAreasOfRectangle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.printf("Insire o valor da largura: ");
        rectangle.width = scan.nextDouble();

        System.out.printf("Insira o valor da altura: ");
        rectangle.heigth = scan.nextDouble();

        System.out.printf("AREA: %.2f%n",rectangle.area());
        System.out.printf("PERIMETER: %.2f%n",rectangle.perimeter());
        System.out.printf("DIAGONAL: %.2f",rectangle.diagonal());

        scan.close();
    }
}
