package Day8.DSA.collections;
import java.util.ArrayList;
import java.util.List;
public class ShoppingCard {
    public static void main(String[] args) {
        List<String> cart=new ArrayList<>();//we should use the interface and then the class inside the interface
        cart.add("Laptop");
        cart.add("mouse");
        cart.add("Keyboard");
        //to remove the cart items
        cart.remove("mouse");
        //when we remove any element in the middle it will not get blank the next element comes there
        System.out.println(cart);

        //to update the cart elements we use "SET"
        cart.set(1,"Mechanical keyboard");
        System.out.println(cart);

        //to get the size of the cart
        System.out.println(cart.size());
    }
}