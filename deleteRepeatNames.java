package nick.pack;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        Создать словарь (Map) занести в него десять записей по принципу «фамилия» - «имя». Удалить людей, имеющих одинаковые имена.
         */
        HashMap<String, String> map = new HashMap<>();
        map.put("Никонов", "Никита");
        map.put("Чистов", "Максим");
        map.put("Толстов", "Егор");
        map.put("Монастырский", "Данил");
        map.put("Кривдин", "Евгений");
        map.put("Зуев", "Алексей");
        map.put("Архипов", "Максим");
        map.put("Майоров", "Михаил");
        map.put("Кольчугин", "Никита");
        map.put("Стожков", "Данил");
        map.put("Кукуризин", "Алексей");
        System.out.println(map.toString());
        ArrayList<String> names = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()){
            String lastname = entry.getValue();
            names.add(lastname);
        }
        int count = 0;
        System.out.println();
        HashSet<String> repeatNames = new HashSet<>();
        for (int i = 0; i < names.size(); i++) {
            for (int j = i + 1; j < names.size(); j++) {
                if (names.get(i).equals(names.get(j))){
                    repeatNames.add(names.get(i));
                }
            }
        }
        names.clear();
        for (String str : repeatNames){
            names.add(str);
        }
        HashMap<String, String> copy = new HashMap<>(map);
            for(Map.Entry<String, String> entry : copy.entrySet()){
                String key = entry.getKey();
                for (int i = 0; i < names.size(); i++) {
                    map.remove(key, names.get(i));
                }
            }
        System.out.println(map.toString());
    }
}


