package Day9.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, String> hashMap1 = new LinkedHashMap<>();
        hashMap1.put("01", "aaaa");
        hashMap1.put("03", "bbbb");
        hashMap1.put("04", "xxxx");
        hashMap1.put("02", "yyyy");
        for (Map.Entry<String, String> entry : hashMap1.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
        }

    }