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
        int[] ints = new int[arrayList.size()];
        String[] strArr = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            try{
                ints[i] = Integer.parseInt(String.valueOf(arrayList.get(i)));
            }
            catch (Exception e){
                strArr[i] = String.valueOf(arrayList.get(i));
            }
        }
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] != 0){
                integers.add(ints[i]);
            }
        }
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] != null){
                strings.add(strArr[i]);
            }
        }
        Collections.sort(integers);
        Collections.sort(strings);
        System.out.println(integers);
        System.out.println(strings);
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<Integer, String> map1 = new HashMap<>();
        int sIndex = 0;
        int iIndex = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < strings.size(); j++) {

            }
        }
    }
}
