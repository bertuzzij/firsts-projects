package entities;

public class PersonData {
	
	private String name;
	private int accountNumber;
	private double bankAccount;

	public PersonData(String name, int accountNumber) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
	}

	public PersonData(String name, int accountNumber, double initialDeposit) {
		this.name = name;
		this.accountNumber = accountNumber;
		addMoney(initialDeposit);//forma de proteger o método construtor caso mude a regra de depósito
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public double getBankAccount() {
		return bankAccount;
	}
	
	public void addMoney(double amount) {
		bankAccount += amount;
	}

	public void withdrawMoney(double amount) {
		bankAccount -= amount + 5.00;
	}
	
	public String toString() {
		return "Account "
				+accountNumber
				+", Holder: "
				+name
				+", Balance: $"
				+ String.format("%.2f", bankAccount);
	}
}
