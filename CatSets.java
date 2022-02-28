package nick.pack;


import java.util.*;

public class Main {
    /*
    1. Внутри класса Solution создать public static класс кот – Cat.
    2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
    3. В методе main удалите одного кота из Set cats.
    4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.
*/
    public static void main(String[] args) {
        HashSet<Cat> cats = new HashSet<>();
        Cat.createCats(cats);
        Iterator<Cat> iterator = cats.iterator();
        cats.remove(iterator.next());
        printCats(cats);
    }
    public static void printCats(HashSet<Cat> cats){
        System.out.println(cats.toString());
    }
    public static class Cat {
        public static void createCats(HashSet<Cat> cats) {
            cats.add(new Cat());
            cats.add(new Cat());
            cats.add(new Cat());
        }
    }
}


