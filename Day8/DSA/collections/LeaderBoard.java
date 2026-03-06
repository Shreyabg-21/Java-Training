package Day8.DSA.collections;
import java.util.*;
public class LeaderBoard {
    public static void main(String[] args) {
        Set<Integer> scores = new TreeSet<>();
        scores.add(450);
        scores.add(200);
        scores.add(125);
        scores.add(320);
        scores.add(197);
        System.out.println("LeaderBoard Stats: " + scores);
    }
}