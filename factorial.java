package nick.pack;

import java.util.ArrayList;
import java.util.Scanner;


public class Main{
    /*
    Задача: Написать метод, который вычисляет факториал - произведение всех чисел от 1 до введенного числа включая его.
    Пример: 4! = factorial(4) = 1*2*3*4 = 24
        1. Ввести с консоли число меньше либо равно 150.
        2. Реализовать функцию factorial.
        3. Если введенное число меньше 0, то вывести 0.
        0! = 1
     */

    public static void main(String[] args) {
        System.out.println("Введите факториал (менее 150)");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        ArrayList<String> list = new ArrayList<>(factorial(str));
        for(String string : list){
            System.out.print(string);
        }
    }
    public static ArrayList<String> factorial(String str) {
        ArrayList<String> result = new ArrayList<>();
        try {
            if (str.contains("!")) {
                int num = Integer.parseInt(str.substring(0, str.length() - 1));
                if (num <= 150) {
                    if (num < 0) {
                        System.out.println(0);
                    } else if (num == 0) {
                        System.out.println(1);
                    } else {
                        int res = 1;
                        for (int i = 2, j = 1, k = 2; i <= num; i++, j++, k++) {
                            res *= i;
                            if (j + 1 != num) {
                                if (j == 1) {
                                    result.add(j + "*" + k);
                                } else {
                                    result.add("*" + k);
                                }
                            } else {
                                result.add("*" + j + "*" + k + "=" + res);
                            }
                        }
                        System.out.println(res);
                    }
                } else
                    System.out.println("Число слишком большое");
            } else
                System.out.println("Факториал должен содержать '!' на конце");
        } catch (Exception e) {
            System.out.println("Введено недопустимое значение");
        }
        return result;
    }
    }
}
