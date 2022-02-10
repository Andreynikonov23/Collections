package nick.pack;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        1. Создай список строк из слов «мама», «мыла», «раму».
        2. После каждого слова вставь в список строку, содержащую слово «именно».
        3. Вывести результат на экран, каждый элемент списка с новой строки.
         */
        ArrayList<String> list = new ArrayList<>();
        list.add("Мама");
        list.add("Мыла");
        list.add("Раму");
        for (int i = 0; i < list.size() - 1; i++) {
            list.add(i+1,"Именно");
            i++;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}


