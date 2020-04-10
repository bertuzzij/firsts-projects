package utils;

public class Calculator {

    public static final double PI = 3.14459; //indica que a variável 'PI' é uma constante que não vai mudar

    //função circumference
    public static double circumference(double radius){ //esse método espera o 'radius' como argumento
        return 2 * PI * radius;
    }

    //função volume
    public static double volume(double radius){ //esse método espera o 'radius' como argumento
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
