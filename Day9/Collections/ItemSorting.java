package Day9.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ItemSorting {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Mobile", 20000, 10));
        products.add(new Product("Camera", 30000, 13));
        products.add(new Product("Laptop", 50000, 1));
        for (Product p : products) {
            System.out.println(p.name + ", " + p.price + ", " + p.quantity);
        }
        Collections.sort(products, (p1, p2) -> p2.quantity - p1.quantity);
        for (Product p : products) {
            System.out.println(p.name +","+p.price+","+p.quantity);
        }
    }
}
