package application;

import java.util.Locale;
import java.util.Scanner;

import entities.PersonData;

public class AccountBank {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		PersonData account; 
		
		System.out.printf("--CADASTRO DE NOVA CONTA--%n");
		
		System.out.printf("Enter account holder: ");
		String name = scan.nextLine();
		
		System.out.printf("Enter account number: ");
		int accountNumber = scan.nextInt();
			
		System.out.printf("Is there na initial deposit (y/n)? ");
		char depInicial = scan.next().charAt(0);
		
		if (depInicial == 'y') {
			System.out.printf("Enter the initial deposit value: ");
			double initialDeposit = scan.nextDouble();
			account = new PersonData(name, accountNumber, initialDeposit); //constructor de sobrecarga. 
		} else {
			 account = new PersonData(name, accountNumber);
		}
		
		
		
		System.out.println("");
		System.out.printf("Account data:%n"
				+ "Account:"+account.getAccountNumber()
				+ ", Holder: "+account.getName()
				+ ", Balance: $ %.2f%n", account.getBankAccount());
		
		System.out.println("");
		System.out.print("Enter a deposit value: ");
		double depositValue = scan.nextDouble();
		account.addMoney(depositValue);
		
		System.out.printf("Updated account data:%n");
		System.out.printf("Account:"+account.getAccountNumber()
				+ ", Holder: "+account.getName()
				+ ", Balance: $ %.2f%n", account.getBankAccount());
		
		System.out.println("");
		System.out.printf("Enter a withdraw value: ");
		double withdraw = scan.nextDouble();
		account.withdrawMoney(withdraw);;
		
		if (account.getBankAccount() < 0) {
			System.out.printf("Updated account data:%n");
			System.out.printf("Account:"+account.getAccountNumber()
				+ ", Holder: "+account.getName()
				+ ", Balance: $ %.2f%n", account.getBankAccount());
			System.out.print("Your account is negative, you must "
					+ "make a deposit to avoid paying a fine!");
			
		} else {
			System.out.printf("Updated account data:%n");
			System.out.printf("Account:"+account.getAccountNumber()
				+ ", Holder: "+account.getName()
				+ ", Balance: $ %.2f%n", account.getBankAccount());
		}
		
		scan.close();
	}

}
