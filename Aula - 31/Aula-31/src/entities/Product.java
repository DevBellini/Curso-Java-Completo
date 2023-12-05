package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return price*quantity;
    }

    //this utiliza o atributo da classe Product, não esse quantity do parametro.
    // Depois ele soma com esse quantity do parametro.
    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -=quantity;
    }
}
