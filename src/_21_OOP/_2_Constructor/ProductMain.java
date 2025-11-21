
package _21_OOP._2_Constructor;

public class ProductMain {
    public static void main(String[] args) {


        Product product = new Product("banana",150.0,4,"general");
        product.printInfo();


        Product product1 = new Product("aple",60.0,5);
        product1.printInfo();


        Product product2 = new Product("mandarin",90.0,"фрукты");
        product2.printInfo();


        Product product3 = new Product("вишня",44.5,"фрукты");
        product3.printInfo();


    }
}