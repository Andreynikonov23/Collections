package nick.pack;


import java.util.Collections;
import java.util.HashSet;

public class Main {
    /*
    Создать множество чисел(Set),
    занести туда 20 различных чисел.
    Удалить из множества все числа больше 10.
     */
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            Collections.addAll(set, (int)(Math.random()*((20-0)+1)+0));
        }
        for (Integer value : set) {
            System.out.print(value + ", ");
        }
        HashSet<Integer> setCopy = new HashSet<>(set);
        for (Integer value : setCopy) {
            if (value > 10){
                set.remove(value);
            }
        }
        System.out.println();
        for (Integer value : set){
            System.out.print(value + ", ");
        }
    }
}
