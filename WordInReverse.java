package nick.pack;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Введи с клавиатуры 5 слов в список строк.
        Удали третий по порядку (индекс 2) элемент списка,
        и выведи оставшиеся элементы в обратном порядке.
         */
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Введите 5 строк");
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            list.add(scanner.nextLine());
        }
        list.remove(2);
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}


