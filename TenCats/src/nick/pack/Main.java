package nick.pack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	/*
	Есть класс кот – Cat, с полем «имя» (String).
	Создать словарь Map и добавить туда 10 котов в виде «Имя»-«Кот».
	Получить из Map множество(Set) всех котов. Вывести множество на экран.
	 */
        HashMap<Cat, String> map = new HashMap<>();
        Cat murzik = new Cat("Мурзик");
        Cat rizhik = new Cat("Рыжик");
        Cat mashka = new Cat("Машка");
        Cat vaska = new Cat("Васька");
        Cat kuzya = new Cat("Кузя");
        Cat barsik = new Cat("Барсик");
        Cat timka = new Cat("Тимка");
        Cat ugolek = new Cat("Уголек");
        Cat sonka = new Cat("Сонька");
        Cat musya = new Cat("Муся");
        Cat murka = new Cat("Мурка");
        map.put(murzik, murzik.getName());
        map.put(rizhik, rizhik.getName());
        map.put(mashka, mashka.getName());
        map.put(vaska, vaska.getName());
        map.put(kuzya, kuzya.getName());
        map.put(barsik, barsik.getName());
        map.put(timka, timka.getName());
        map.put(ugolek, ugolek.getName());
        map.put(sonka, sonka.getName());
        map.put(musya, musya.getName());
        map.put(murka, murka.getName());
        HashSet<String> set = new HashSet<>();
        for (Map.Entry<Cat, String> entry : map.entrySet()){
            set.add(entry.getValue());
        }
        System.out.println(set);
    }
}
