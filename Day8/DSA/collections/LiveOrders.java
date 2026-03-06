package Day8.DSA.collections;
import java.util.*;
public class LiveOrders {
        public static void main(String[] args) {
            Collection<String> liveOrders=new ArrayList<>();
            //new orderss are added
            liveOrders.add("100");
            liveOrders.add("101");
            liveOrders.add("102");
            //check order
            System.out.println("103 exists"+liveOrders.contains("103"));//contains is the method in the collection interface
            // so we can use that
            //check the live orders
            System.out.println("live orders"+liveOrders);
            //to remove one eleemnt
//        liveOrders.remove("100");//this will reomvw a particular collection
            //to clear all the elements
            liveOrders.clear();
            System.out.println("live orders after clearing"+liveOrders);

        }
    }