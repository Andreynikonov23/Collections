package nick.pack;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        В словарь (Map<String, Date>) занести десять записей по принципу: «фамилия» - «дата рождения». Удалить из словаря всех людей, родившихся летом.
         */
        HashMap<String, Date> map = new HashMap<>();
        map.put("Никонов", new Date(109, 5, 24));
        map.put("Чистов", new Date(100, 0, 8));
        map.put("Толстов", new Date(102, 4, 24));
        map.put("Монастырский", new Date(100, 11, 19));
        map.put("Кривдин", new Date(101, 3, 12));
        map.put("Зуев", new Date(100, 05, 24));
        map.put("Майоров", new Date(98, 8, 23));
        map.put("Дружинин", new Date(101, 5, 12));
        map.put("Щенников", new Date(99, 8, 15));
        map.put("Чикеев", new Date(101, 8, 4));
        System.out.println(map.toString());
        Date startSummer = new Date();
        startSummer.setMonth(5);
        Date finishSummer = new Date();
        finishSummer.setMonth(7);
        HashMap<String, Date> copy = new HashMap<>(map);
        for (Map.Entry<String, Date> entry : copy.entrySet()){
            String key = entry.getKey();
            Date birthday = entry.getValue();
            if (birthday.getMonth() >= startSummer.getMonth() && birthday.getMonth() <= finishSummer.getMonth()){
                map.remove(key);
            }
        }
        System.out.println(map.toString());
    }
}


