package nick.pack;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        1. Создай список строк.
        2. Считай с клавиатуры 5 строк и добавь в список.
        3. Используя цикл, найди самую короткую строку в списке.
        4. Выведи найденную строку на экран.
        5. Если таких строк несколько, выведи каждую с новой строки.
         */
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Введите 5 строк");
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            list.add(scanner.nextLine());
        }
        int maxValue = 0;
        String veryBigLine = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > maxValue){
                maxValue = list.get(i).length();
                veryBigLine = list.get(i);
            }
        }
        int minSize = veryBigLine.length();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < minSize){
                minSize = list.get(i).length();
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (minSize == list.get(i).length()){
                System.out.println(list.get(i));
            }
        }
    }
}
