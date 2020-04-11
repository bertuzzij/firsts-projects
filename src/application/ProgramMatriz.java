package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMatriz {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        //mat.length == percorre o número de linhas da matriz
        //mat[i].length == percorre o número de colunas que houver na matriz (i)

        System.out.printf("Qual será o tamanho da matriz? ");
        int n = scan.nextInt();

        int[][] mat = new int[n][n]; //será instanciada uma matriz BIDIMENSIONAL de 'n' linhas e 'n' colunas

        for (int i= 0;i < mat.length; i++){ //aqui será inserido os valores das 'linhas' da matriz
            for (int j = 0; j < mat[i].length; j++){ //aqui será inserido os valores das 'colunas' da matriz
                mat[i][j] = scan.nextInt();
            }
        }

        System.out.println("Main diagonal:");
        for (int i = 0;i < mat.length; i++){
            System.out.print(mat[i][i] + " "); //será exibidos os valores que ficam na diagonal principal da matriz
        }

        int count = 0;
        for (int i= 0;i< mat.length ; i++) {
            for (int j= 0;j < mat[i].length ; j++) {
                if (mat[i][j] < 0){ //verifica se algum número é menor que 0
                    count++; //'count' vai somando o número de vezes que fossem encontrados
                }
            }
        }

        System.out.println();
        System.out.println("Negative numbers = "+count);

        scan.close();
    }
}
