package application;

//1-Fazer um programa que leia os dados do func (nome, salário bruto e imposto)
//2-Mostrar os dados do func (nome e salário líquido
//3-Aumentar o salario do func com base em uma porcentagem dada(somente salário bruto é afetado pela porcentagem)
//4-Mostrar os dados atualizados do func

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class SalaryOfFunctionary {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.printf("Insert yout Name: ");
        employee.name = scan.nextLine();

        System.out.printf("Insert your Gross Salary: ");
        employee.grossSalary = scan.nextDouble();

        System.out.print("Insert Tax: ");
        employee.tax = scan.nextDouble();

        System.out.printf("%n");
        System.out.printf("Employee: "+employee.name+" , $ %.2f%n",employee.netSalary());

        System.out.print("Which percentage to increase salary? ");
        employee.percentage = scan.nextDouble();

        System.out.printf("%n");
        System.out.printf("Updated data: "+employee.name+", $ %.2f",employee.increaseSalary());


        scan.close();
    }
}
