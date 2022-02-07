package nick.pack;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        1. Считай с клавиатуры 5 чисел и добавь в список integers.
        2. Найди максимальное число в списке.
        3. Выведи найденное число на экран.
         */
        ArrayList<Integer> integers = new ArrayList<>();
        System.out.println("Введите 5 чисел");
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            integers.add(scanner.nextInt());
        }
        int maxValue = 0;
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) > maxValue){
                maxValue = integers.get(i);
            }
        }
        for (int i = 0; i < integers.size(); i++) {
            System.out.print(integers.get(i) + ", ");
        }
        System.out.println();
        System.out.println(maxValue);
    }
}
