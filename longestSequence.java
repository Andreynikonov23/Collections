package nick.pack;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    /*
    1. Создай список чисел.
    2. Добавь в список 10 чисел с клавиатуры.
    3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Введите 10 чисел");
        for (int i = 0; i < 10; i++) {
            Scanner scanner = new Scanner(System.in);
            list.add(scanner.nextInt());
        }
        int result = 1;
        ArrayList<Integer> counts = new ArrayList<>();
        for (int i = 0, k = 1; i < list.size() -1; i++, k++) {
            if (list.get(i) == list.get(k)){
                result++;
                counts.add(result);
            } else if(result > 1){
                result = 1;
            }
        }
        System.out.println(Collections.max(counts));
    }
}


