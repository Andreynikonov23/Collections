package nick.pack;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    //Наибольший общий делитель (НОД).
    //Ввести с клавиатуры 2 целых положительных числа.
    //Вывести в консоль наибольший общий делитель.
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> aList = new ArrayList<>();
        ArrayList<Integer> bList = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        boolean isFalseForA = false;
        for (int i = a; i != 1;) {
            if (i%2 == 0) {
                aList.add(2);
                i /= 2;
            } else if (i%3 == 0){
                aList.add(3);
                i/=3;
            } else {
                for (int j = 5; j <= a; j+=2) {
                    if (i%j == 0){
                        aList.add(j);
                        i/=j;
                        break;
                    } else isFalseForA = true;
                }
            }
            if (isFalseForA == true){
                aList.add(i);
                i/=i;
            }
        }
        boolean isFalseForB = false;
        for (int i = b; i != 1;) {
            if (i%2 == 0) {
                bList.add(2);
                i /= 2;
            } else if (i%3 == 0){
                bList.add(3);
                i/=3;
            } else {
                for (int j = 5; j <= b; j+=2) {
                    if (i%j == 0){
                        bList.add(j);
                        i/=j;
                        break;
                    } else isFalseForB = true;
                }
            }
            if (isFalseForB == true){
                bList.add(i);
                i/=i;
            }
        }
        for (int i = 0; i < aList.size(); i++) {
            if (aList.get(i) == 1){
                aList.remove(i);
            }
        }
        for (int i = 0; i < bList.size(); i++) {
            if (bList.get(i) == 1){
                bList.remove(i);
            }
        }
        int size = 0;
        for (int i = 0; i < aList.size(); i++) {
            if (bList.contains(aList.get(i))){
                result.add(aList.get(i));
                bList.remove(aList.get(i));
            }
        }
        int sum = 1;
        if (result.size() > 0){
            sum = result.get(0);
            if (result.size() > 1){
                for (int i = 1; i < result.size(); i++) {
                    sum *=result.get(i);
                }
            }
        }
        System.out.println(sum);
    }
}
