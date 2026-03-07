package Day9.Collections;
import java.util.ArrayList;
import java.util.Collections;

public class StudentSort {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(101, "Shreya"));
        list.add(new Student(108, "Shravya"));
        list.add(new Student(200, "Shashank"));
        for (Student s : list){
            System.out.println(s.id+", " + s.name);
        }
        // ascending order based on id
        Collections.sort(list, (s1, s2) -> s1.id - s2.id);
        for (Student s : list){
            System.out.println(s.id + ", " + s.name);
        }
    }
}