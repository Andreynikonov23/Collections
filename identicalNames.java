package nick.pack;


import java.util.*;

public class Main {
    public static void main(String[] args) {
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
        ArrayList<String> names = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()){
            String lastname = entry.getValue();
            names.add(lastname);
        }
        int count = 0;
        System.out.println();
        for (int i = 0; i < names.size(); i++) {
            for (int j = i + 1; j < names.size(); j++) {
                if (names.get(i).equals(names.get(j))){
                    count++;
                }
            }
        }
        System.out.println(count + " человек имеют одинаковые имена");
    }
}


