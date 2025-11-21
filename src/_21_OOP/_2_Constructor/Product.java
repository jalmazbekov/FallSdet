package _21_OOP._2_Constructor;

public class Product {
    String name;
    double price;
    int quantity;
    String category = "general";

    public Product(String category, String name, double price, int quantity) {
        this.category = category;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public Product(String name, double price, int quantity, String category) {
        this.name = "undefined";
        this.price = 0.0;
        this.quantity = 0;
        this.category ="general";
    }

    public Product() {

    }

    public void printInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Price:"+this.price);
        System.out.println("Quantity:" + this.quantity);
    }

    @Override
    public String toString() {
        return "Product{" +
                "category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}

