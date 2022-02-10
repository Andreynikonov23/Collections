package nick.pack;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        1. Создай список строк.
        2. Добавь в него 5 строк с клавиатуры.
        3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
        4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.
         */
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Введите 5 строк");
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            list.add(scanner.nextLine());
        }
        for (int i = 0; i < 13; i++) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}


