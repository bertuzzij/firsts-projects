package application;

import entities.EmployeeOO;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        List<EmployeeOO>list = new ArrayList<>();

        // PART 1 - READING DATA:

        System.out.printf("How many employees will be registered? ");
        int n = scan.nextInt();

        for (int i = 1; i <= n;i++){
            scan.nextLine();
            System.out.printf("Employee #"+i+"%n");

            System.out.printf("ID: ");
            int id = scan.nextInt();

            scan.nextLine();
            System.out.printf("Name: ");
            String name = scan.nextLine();

            System.out.printf("Salary:$ ");
            double salary = scan.nextDouble();

            list.add(new EmployeeOO(id, name, salary));//cria uma lista a partir da classe atribuindo os valores recebidos
        }

        // PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:

        System.out.println();
        System.out.printf("Enter the employee id that will have salary increase: ");
        int id = scan.nextInt();

        EmployeeOO emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);//filtro que verifica se o id é existente
        if (emp == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage = scan.nextDouble();
            emp.newSalary(percentage);
        }

        // PART 3 - LISTING EMPLOYEES:

        System.out.println();
        System.out.println("List of employees:");
        for (EmployeeOO obj : list) {
            System.out.println(obj);
        }

    scan.close();
    }
}
