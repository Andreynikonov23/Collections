package nick.pack;

import java.util.ArrayList;

public class Main{
    /*
    В методе createList: - создать список, элементами которого будут массивы чисел;
    - добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно;
    - заполнить массивы любыми данными.
     */
    public static void main(String[] args) {
        ArrayList<int[]> arrayList = new ArrayList<>();
        createList(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.get(i).length; j++) {
                System.out.print(arrayList.get(i)[j] + " ");
            }
            System.out.println();
        }
    }
    public static ArrayList<int[]> createList(ArrayList<int[]> arrayList){
        int[] array5 = new int[5];
        int[] array2 = new int[2];
        int[] array4 = new int[4];
        int[] array7 = new int[7];
        int[] array0 = new int[0];
        for (int i = 0; i < array5.length; i++) {
            array5[i] = i;
        }
        arrayList.add(array5);
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 1;
        }
        arrayList.add(array2);
        for (int i = 0; i < array4.length; i++) {
            array4[i] = (int) (Math.random()*((1000 + 0) + 1) + 0);
        }
        arrayList.add(array4);
        for (int i = 0; i < array7.length; i++) {
            array7[i] = (int) (Math.random()*((1000 + 0) + 1) + 0);
        }
        arrayList.add(array7);
        arrayList.add(array0);
        return arrayList;
    }
}
