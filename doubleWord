package nick.pack;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<String> list;
    public static void main(String[] args) {
        /*
        1. Введи с клавиатуры 10 слов в список строк.
        2. Метод doubleValues должен удваивать слова по принципу:
            "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
        3. Выведи результат на экран, каждое значение с новой строки.
         */
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Scanner scanner = new Scanner(System.in);
            list.add(scanner.nextLine());
        }
        doubleValues(list);
    }
    public static void doubleValues(ArrayList<String> list){
        for (int i = 0; i < list.size(); i++) {
            list.add(i + 1, list.get(i));
            i++;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}


