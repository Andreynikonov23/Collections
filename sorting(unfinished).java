package nick.pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Main{
    /*
    Программа считывает с клавиатуры слова и числа,
    добавляет их в список, преобразует список к массиву, выводит массив на экран.
    Реализуй сортировку массива, чтобы слова вывелись в возрастающем порядке, а числа — в убывающем.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(reader.readLine());
        }
        System.out.println(arrayList);
        ArrayList<String> temp = new ArrayList<>();
        int[] ints = new int[arrayList.size()];
        String[] strArr = new String[arrayList.size()];
        int[] nulls = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            try{
                ints[i] = Integer.parseInt(String.valueOf(arrayList.get(i)));
                if (ints[i] != 0) {
                    temp.add("i");
                }
            }
            catch (Exception e){
                strArr[i] = String.valueOf(arrayList.get(i));
                temp.add("s");
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals("0")){
                nulls[i] = 1;
            }
        }
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            integers.add(ints[i]);
        }
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] != null){
                strings.add(strArr[i]);
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals("0")){
                integers.add(0);
            }
        }
        Collections.sort(integers);
        Collections.sort(strings);
        Collections.reverse(integers);
        System.out.println(integers);
        System.out.println(strings);
        ArrayList<String> newList = new ArrayList<>();
        System.out.println(temp);
        for (int i = 0, str=0, integer=0; i < temp.size(); i++) {
            if (temp.get(i).equals("s")){
                newList.add(strings.get(str));
                str++;
            }
            if (temp.get(i).equals("i")){
                newList.add(String.valueOf(integers.get(integer)));
                integer++;
            }
        }
        System.out.println(newList);
    }
}
