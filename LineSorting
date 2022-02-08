package nick.pack;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<String> list;
    public static void main(String[] args) {
        /*
           1. Введи с клавиатуры 10 слов в список строк.
           2. Определить, является ли список упорядоченным по возрастанию длины строки.
           3. В случае отрицательного ответа вывести на экран индекс первого элемента,
              нарушающего такую упорядоченность.
         */
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Scanner scanner = new Scanner(System.in);
            list.add(scanner.nextLine());
        }
        boolean isFalse = true;
        int i = 1;
        for (; i < list.size(); i++) {
            if (list.get(i - 1).length() > list.get(i).length()){
                isFalse = false;
                break;
            }
        }
        if (isFalse == false){
            System.out.println("Длинна строк не упорядочена");
            System.out.printf("Строка №%d, больше или равна чем следущая", i);
        } else
            System.out.println("Длинна строк упорядочена");
    }
}


