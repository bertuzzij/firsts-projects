package application;

import entities.StudentGrades;

import java.util.Locale;
import java.util.Scanner;

public class CalculateMediaOfStudy {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        StudentGrades grades = new StudentGrades();

        System.out.print("Digite o nome do aluno: ");
        grades.name = scan.nextLine();

        System.out.println("Digite as três notas do aluno:");
        grades.gradeA = scan.nextDouble();
        grades.gradeB = scan.nextDouble();
        grades.gradeC = scan.nextDouble();

        System.out.printf(" %nFINAL GRADE: "+grades.totalGrade());

        if (grades.totalGrade < 60) {
            System.out.printf("%nFAILED %n" +
                    "MISSING %.2f POINTS", grades.mediaGrade());
        } else {
            System.out.printf("%nPASS");
        }

        scan.close();
    }
}
