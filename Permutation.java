package nick.pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    /*
    Ввести с клавиатуры 2 числа N и M.
    Ввести N строк и заполнить ими список.
    Переставить M первых строк в конец списка.
    Вывести список на экран, каждое значение с новой строки.
    Примечание: - все числа и строки нужно вводить с клавиатуры с новой строки;
    - запрещено создавать больше одного списка.
     */
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Insert N and M");
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        System.out.println("Insert Lines");
        for (int i = 0; i < n; i++) {
            list.add(reader.readLine());
        }
        if (m < n) {
            for (int i = 0; i < m; i++) {
                list.add(list.get(0));
                list.remove(0);
            }
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        } else
            System.out.println("Error: M > N");
    }
}
