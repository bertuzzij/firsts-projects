package entities;

public class Products {

    public  String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity; //soma o quantity o valor do argumento 'int quantity' no atributo quantity da classe products;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity; //subtrai o valor do argumento 'int quantity' no atributo quantity da classe products;
    }

    public String toString(){
        return name
                +", $ "
                +String.format("%.2f",price) //converte o valor de 'price' para exibir com 2 casas decimais
                +", "
                +quantity
                +" units, Total: $ "
                +String.format("%.2f",totalValueInStock()); //converte o valor de 'totalValueInStock' para exibir com 2 casas decimais
    }
}
