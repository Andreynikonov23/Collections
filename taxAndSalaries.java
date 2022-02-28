package nick.pack;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        Создать словарь (Map) и занести в него десять записей по принципу: «фамилия» - «зарплата».
        Удалить из словаря всех людей, у которых зарплата ниже 500.
         */
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Никонов", 300);
        map.put("Чистов", 500);
        map.put("Толстов", 600);
        map.put("Монастырский", 1000);
        map.put("Кривдин", 100);
        map.put("Зуев", 700);
        map.put("Майоров", 800);
        map.put("Дружинин", 600);
        map.put("Щенников", 900);
        map.put("Чикеев", 200);
        System.out.println(map.toString());
        HashMap<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> entry : copy.entrySet()){
            String name = entry.getKey();
            int salary = entry.getValue();
            if (salary < 500){
                map.remove(name);
            }
        }
        System.out.println(map.toString());
    }
}


