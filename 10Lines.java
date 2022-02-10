package nick.pack;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        1. Создай список строк в методе main.
        2. Добавь в него 10 строчек с клавиатуры,
           но только добавлять не в конец списка, а в начало.
        3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
         */
        ArrayList<String> list = new ArrayList<>();
        list.add(0, "Andrey");
        list.add(0, "Alexander");
        list.add(0, "Artem");
        list.add(0, "Alexey");
        list.add(0, "Danil");
        System.out.println("Размер списка: " + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}


