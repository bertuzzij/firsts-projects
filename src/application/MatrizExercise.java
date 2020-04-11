package application;

import java.util.Locale;
import java.util.Scanner;

public class MatrizExercise {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Tamanho de linhas: ");
        int x = scan.nextInt();
        System.out.print("Tamanho de colunas: ");
        int y = scan.nextInt();

        int[][] mat = new int[x][y];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[j].length; j++) {
                mat[i][j] = scan.nextInt();
            }
        }

        System.out.println("Digite o valor que deseja buscar na matriz: ");
        int value = scan.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == value) { //encontra o valor da variável 'value' e compara com os valores da matriz
                    System.out.println("Position " + i + "," + j + ":"); //exibe a posição da linha e coluna do valor da variável 'value'

                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if (j < mat[i].length - 1) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    if (i < mat.length - 1) {
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                }
            }
        }

        scan.close();
    }
}
