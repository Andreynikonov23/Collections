package nick.pack;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        1. Создай список слов, заполни его самостоятельно.
        2. Метод fix должен:
            2.1. удалять из списка строк все слова, содержащие букву "р"
            2.2. удваивать все слова содержащие букву "л".
            2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
            2.4. с другими словами ничего не делать.
         */
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            list.add(scanner.nextLine());
        }
        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).contains("р") || list.get(i).contains("Р")){
                if (list.get(i).contains("л") || list.get(i).contains("Л")){
                } else
                    list.remove(i);
            }
            if(list.get(i).contains("л") || list.get(i).contains("Л")){
                if (list.get(i).contains("р") || list.get(i).contains("Р")){
                } else {
                    list.add(i + 1, list.get(i));
                    i++;
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
    }
}


