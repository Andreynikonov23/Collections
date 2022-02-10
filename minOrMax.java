package nick.pack;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        1. Создай список строк.
        2. Добавь в него 10 строчек с клавиатуры.
        3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
           Если таких строк несколько, то должны быть учтены самые первые из них.
        4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
         */
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Введите 10 строк");
        for (int i = 0; i < 10; i++) {
            Scanner scanner = new Scanner(System.in);
            list.add(scanner.nextLine());
        }
        int maxValue = 0;
        String veryBigLine = null;
        int maxLineIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > maxValue){
                maxValue = list.get(i).length();
                veryBigLine = list.get(i);
                maxLineIndex = i;
            }
        }
        int minSize = veryBigLine.length();
        int minLineIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < minSize){
                minSize = list.get(i).length();
                minLineIndex = i;
            }
        }
        if (maxLineIndex < minLineIndex){
            System.out.println(veryBigLine);
        } else
            System.out.println(list.get(minLineIndex));
    }
}


