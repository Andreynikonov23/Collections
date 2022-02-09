package nick.pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    /*
    программа считывает строки с клавиатуры, пока не будет введена пустая строка.
    Далее программа создает новый список строк по следующему алгоритму:

    Если в считанной строке чётное количество символов, строка удваивается и разделяется пробелом:
        "qq" -> "qq qq"
        "сорок один" -> "сорок один сорок один"
    Если нечётное — утраивается и разделяется пробелом:
        "z" -> "z z z"
        "j r" -> "j r j r j r"
        ". 1" -> ". 1 . 1 . 1"
        "баг" -> "баг баг баг".
     */
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean isFalse = true;
        System.out.println("Введите строки, чтобы закончить - введите пустую строку");
        for (int i = 0; isFalse == true; i++) {
            list.add(reader.readLine());
            if(list.get(i).isEmpty()){
                isFalse = false;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length()%2 == 0){
                list.set(i, list.get(i) + " " + list.get(i));
            } else
                list.set(i, list.get(i) + " " + list.get(i) + " " + list.get(i));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
