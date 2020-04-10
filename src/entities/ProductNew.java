package entities;

public class ProductNew {
	
	//atributos do objeto
	public String name;
	public double price;
	public int quantity;
	
	//parâmetros do método constructor
	public ProductNew(String name, double price, int quantity) {//ao instanciar o objeto será solicitado os dados do 'name, price e quantity' como informados no argumento 
		this.name = name; //this == referência para o próprio objeto
		this.price = price;
		this.quantity = quantity;
		
	}
	
	//método de sobrecarga do constructor
	public ProductNew(String name, double price) {//construtor de sobrecarga
		this.name = name;
		this.price = price;

	}
	
	public double getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}