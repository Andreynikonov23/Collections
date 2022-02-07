package nick.pack;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Andrey");
        list.add("Alexander");
        list.add("Artem");
        list.add("Alexey");
        list.add("Sergey");
        System.out.println("Размер списка: " + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}


