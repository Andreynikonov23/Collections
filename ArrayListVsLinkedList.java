package nick.pack;


import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static ArrayList<Integer> arrayList = new ArrayList<>();
    public static LinkedList<Integer> linkedList = new LinkedList<>();
    public static void main(String[] args) {
        long result = 0;
        Instant startAddArray = Instant.now();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
        }
        Instant finishAddArray = Instant.now();
        result = Duration.between(startAddArray, finishAddArray).toMillis();
        System.out.println("Время выполнения дабавления данных в ArrayList: " + result);
        Instant startAddLinked = Instant.now();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(i);
        }
        Instant finishAddLinked = Instant.now();
        result = Duration.between(startAddLinked, finishAddLinked).toMillis();
        System.out.println("Время выполнения добавления данных в LinkedList: " + result);
        Instant startRemoveArray = Instant.now();
        for (int i = 0; i < 10000; i++) {
            arrayList.remove(0);
        }
        Instant finishRemoveArray = Instant.now();
        result = Duration.between(startRemoveArray, finishRemoveArray).toMillis();
        System.out.println("Время выполнения удаления данных в ArrayList: " + result);
        Instant startRemoveLinked = Instant.now();
        for (int i = 0; i < 10000; i++) {
            linkedList.remove(0);
        }
        Instant finishRemoveLinked = Instant.now();
        result = Duration.between(startRemoveLinked, finishRemoveLinked).toMillis();
        System.out.println("Время выполнения удаления данных в LinkedList: " + result);
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        getInsertTimeIn();
        getGetTimeInMs();
    }
    public static void getInsertTimeIn(){
        long result = 0;
        Instant startSetArray = Instant.now();
        for (int i = 0, j = 10000; i < 10000; i++, j--) {
            arrayList.set(i, j);
        }
        Instant finishSetArray = Instant.now();
        result = Duration.between(startSetArray, finishSetArray).toMillis();
        System.out.println("Время выполнения вставки данных для ArrayList: " + result);
        Instant startSetLinked = Instant.now();
        for (int i = 0, j = 10000; i < 10000; i++, j--) {
            linkedList.set(i, j);
        }
        Instant finishSetLinked = Instant.now();
        result = Duration.between(startSetLinked, finishSetLinked).toMillis();
        System.out.println("Время выполнения вставки данных для LinkedList: " + result);
    }
    public static void getGetTimeInMs(){
        long result = 0;
        Instant startArray = Instant.now();
        for (int i = 0; i < 10000; i++) {
            arrayList.get(i);
        }
        Instant finishArray = Instant.now();
        result = Duration.between(startArray, finishArray).toMillis();
        System.out.println("Время выполнения получения данных для ArrayList: " + result);
        Instant startLined = Instant.now();
        for (int i = 0; i < 10000; i++) {
            linkedList.get(i);
        }
        Instant finish = Instant.now();
        result = Duration.between(startLined, finish).toMillis();
        System.out.println("Время выполнения получения данных для LinkedList: " + result);
    }
}

