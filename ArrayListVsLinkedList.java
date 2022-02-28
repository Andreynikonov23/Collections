package nick.pack;


import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static ArrayList<Integer> arrayList = new ArrayList<>();
    public static LinkedList<Integer> linkedList = new LinkedList<>();
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
        }
        System.out.println("Время выполнения добавления данных в ArrayList: " + System.currentTimeMillis());
        for (int i = 0; i < 10000; i++) {
            linkedList.add(i);
        }
        System.out.println("Время выполнения добавления данных в LinkedList: " + System.currentTimeMillis());
        for (int i = 0; i < 10000; i++) {
            arrayList.remove(0);
        }
        System.out.println("Время выполнения удаления данных в ArrayList: " + System.currentTimeMillis());
        for (int i = 0; i < 10000; i++) {
            linkedList.remove(0);
        }
        System.out.println("Время выполнения удаления данных в LinkedList: " + System.currentTimeMillis());
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        getInsertTimeIn();
        getGetTimeInMs();
    }
    public static void getInsertTimeIn(){
        for (int i = 0, j = 10000; i < 10000; i++, j--) {
            arrayList.set(i, j);
        }
        System.out.println("Время выполнения вставки данных для ArrayList: " + System.currentTimeMillis());
        for (int i = 0, j = 10000; i < 10000; i++, j--) {
            linkedList.set(i, j);
        }
        System.out.println("Время выполнения вставки данных для LinkedList: " + System.currentTimeMillis());
    }
    public static void getGetTimeInMs(){
        for (int i = 0; i < 10000; i++) {
            arrayList.get(i);
        }
        System.out.println("Время выполнения получения данных для ArrayList: " + System.currentTimeMillis());
        for (int i = 0; i < 10000; i++) {
            linkedList.get(i);
        }
        System.out.println("Время выполнения получения данных для LinkedList: " + System.currentTimeMillis());
    }
}
