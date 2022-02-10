package nick.pack;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Cat tom = new Cat("Tom");
        Cat barsik = new Cat("Барсик");
        Cat murzik = new Cat("Мурзик");
        Cat rizhk = new Cat("Рыжик");
        Cat ugolek = new Cat("Уголек");
        Cat vaska = new Cat("Васька");
        Cat mashka = new Cat("Машка");
        Cat kuzya = new Cat("Кузя");
        HashMap<String, Object> map = new HashMap<>();
        map.put(tom.getName(), tom);
        map.put(barsik.getName(), barsik);
        map.put(murzik.getName(), murzik);
        map.put(rizhk.getName(), rizhk);
        map.put(ugolek.getName(), ugolek);
        map.put(vaska.getName(), vaska);
        map.put(mashka.getName(), mashka);
        map.put(kuzya.getName(), kuzya);

        for(Map.Entry<String, Object> mapEntry: map.entrySet()){
            String name = mapEntry.getKey();
            Object obj = mapEntry.getValue();
            System.out.println(name + " = " + obj);
        }
    }
}
