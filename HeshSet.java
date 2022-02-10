package nick.pack;

import java.util.HashSet;

public class Main {
    /*
    Создать коллекцию Set (реализация HashSet) с типом элементов String.
    Добавить в неё 10 строк:
    арбуз банан вишня груша дыня ежевика женьшень земляника ирис картофель.
    Вывести содержимое коллекции на экран,
    каждый элемент с новой строки. Посмотреть, как изменился порядок добавленных элементов.
     */
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("женьшень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");

        for (String str : set) {
            System.out.println(str);
        }
    }
}
