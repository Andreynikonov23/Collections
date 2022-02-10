package nick.pack;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощь");
        map.put("ежевика", "куст");
        map.put("женьшень", "куст");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");

       for(Map.Entry<String, String> mapEntry : map.entrySet()){
           String key = mapEntry.getKey();
           String value = mapEntry.getValue();
           System.out.println(key + " -> " + value);
       }
        System.out.println("Способ 2");
        for (var data : map.entrySet()) {
            System.out.println(data);
        }
    }
}
