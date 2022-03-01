package nick.pack;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    /*
    1. Ввести с клавиатуры число N.
    2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
    3. Найти минимальное число среди элементов списка - метод getMinimum.
     */
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        System.out.println("Введите число N");
        int num = Integer.parseInt(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>(getIntegerList(num));
        System.out.println("Минимальное число: " + getMinimum(list));
    }
    public static ArrayList<Integer> getIntegerList(int num) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Введите числа");
        for (int i = 0; i < num; i++) {
            int count = Integer.parseInt(reader.readLine());
            list.add(count);
        }
        System.out.println(list);
        return list;
    }
    public static int getMinimum(ArrayList<Integer> list) {
        int min = Collections.min(list);
        return min;
    }
}
