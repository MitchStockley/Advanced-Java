package lesson7;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        Map<String, String> partList = new TreeMap<>();
        partList.put("soo1", "Blue polo shirt");
        partList.put("soo2", "Black polo shirt");
        partList.put("H001", "Duke Shirt");
        System.out.println(partList);
        partList.put("soo2", "Black T-shirt");
        System.out.println(partList);

        Set<String> keys = partList.keySet();

        for(String k : keys){
            System.out.println(partList.get(k));
        }
    }
}
