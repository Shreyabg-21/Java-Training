package Day8.DSA.collections;
import java.util.*;
public class MaintainInsertionOrder {
    public static void main(String[] args) {
        HashSet<Integer> set = new LinkedHashSet<>();
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(3);
        set.add(12);
        set.add(31);
        set.add(21);
        set.add(32);
        System.out.println(set);
    }
}
