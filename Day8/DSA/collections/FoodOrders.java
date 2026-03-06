package Day8.DSA.collections;
import java.util.*;
public class FoodOrders {

        public static void main(String[] args) {
            Queue<String> orders=new LinkedList<>();//here Queue is the interface
            //to add to the linked list
            orders.add("Order101");//strict capacity based
            orders.offer("Order102");//this is flexible
            System.out.println(orders);

            //to remove the eleemnt in the linkedlist
//        System.out.println(orders.remove());//Strict [fail]
            System.out.println("Serving"+orders.poll());//Not strict[not fail]//removes firts
            System.out.println(orders);

        }
    }