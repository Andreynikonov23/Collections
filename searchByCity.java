package nick.pack;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    /*
    Программа считывает с консоли строки, пока не будет введена пустая строка.
    Поочередно вводятся название города и фамилия семьи, которая живет в этом городе.
    Подумай какая структура данных лучше всего подходит для хранения пары
    "название города - фамилия семьи".
    Далее считывается с консоли строка - название города.
    Программа должна по названию города выводить на экран фамилию семьи, которая в нем проживает.
     */
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        HashMap<String, String> map = new HashMap<>();
        while (true){
            String city = reader.readLine();
            if (city.isEmpty()){
                break;
            }
            String family = reader.readLine();
            if (family.isEmpty()){
                break;
            }
            map.put(city, family);
        }
        System.out.println("Введите город");
        while (true) {
            String enterCity = reader.readLine();
            if (enterCity.isEmpty()){
                break;
            }
            if (map.containsKey(enterCity)) {
                System.out.println(map.get(enterCity));
            } else
                System.out.println("Город не найден");
        }
    }
}
