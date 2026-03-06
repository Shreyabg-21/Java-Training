package Day8.DSA.collections;
import java.util.*;
public class ArrayDequeExample {

        public static void main(String[] args) {
            Deque<String> actions=new ArrayDeque<>();

            //⭐deque is the double ended queue

            //💠adding the elemnts in the dequeue
            //to last
            actions.addLast("a");
            actions.addLast("b");
            actions.addLast("c");
            System.out.println(actions);

            //💠for removing the element
            System.out.println("Undo:"+actions.removeLast());
            System.out.println(actions);
        }
    }
