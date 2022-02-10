package nick.pack;


import java.util.*;

public class Main {
    /*
    Создать словарь (Map) занести в него десять записей по принципу
    «фамилия» - «имя». Удалить людей, имеющих одинаковые имена.
     */
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Никонов", "Андрей");
        map.put("Монастырский", "Данил");
        map.put("Карасев", "Виктор");
        map.put("Чистов", "Максим");
        map.put("Зуев", "Алексей");
        map.put("Дружинин", "Артем");
        map.put("Чикеев", "Александр");
        map.put("Стожков", "Данил");
        map.put("Безделев", "Алексей");
        map.put("Алипов", "Артем");

        int count = 0;
        for(var va : map.entrySet()){
            System.out.println(va);
        }
        HashMap<String, String> mapClone = new HashMap<>(map);
        for(Map.Entry<String, String> mapEntry : mapClone.entrySet()){
            String key = mapEntry.getKey();
            String value = mapEntry.getValue();
            count = Collections.frequency(mapClone.values(), value);
                if (count > 1) {
                    map.remove(key);
            }
        }
        System.out.println();
        for(var v : map.entrySet()){
            System.out.println(v);
        }
    }
}
