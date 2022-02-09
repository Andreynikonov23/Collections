package nick.pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    /*
    Создать список строк.
    Ввести строки с клавиатуры и добавить их в список.
    Вводить с клавиатуры строки, пока пользователь не введет строку "end".
    Саму строку "end" не учитывать. Вывести строки на экран, каждую с новой строки.
     */
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строки, чтобы закончить - введите end");
        for (int i = 0; true; i++) {
            String str = reader.readLine();
            if (str.equalsIgnoreCase("end")){
                break;
            } else {
                list.add(str);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
