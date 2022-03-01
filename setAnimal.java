package nick.pack;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Main {
    /*
    1. Внутри класса Solution создать public static классы Cat,
    Dog без конструктора или с конструктором без параметров.
    2. Реализовать метод createCats, который должен возвращать множество с 4 котами.
    3. Реализовать метод createDogs, который должен возвращать множество с 3 собаками.
    4. Реализовать метод join, который должен
    возвращать объединенное множество всех животных - всех котов и собак.
    5. Реализовать метод removeCats,
    который должен удалять из множества pets всех котов, которые есть в множестве cats.
    6. Реализовать метод printPets,
    который должен выводить на экран всех животных, которые в нем есть.
    Каждое животное с новой строки.
     */
    public static void main(String[] args) {
        HashSet<Cat> cats = new HashSet<>(Cat.createCats());
        System.out.println(cats.toString());
        HashSet<Dog> dogs = new HashSet<>(Dog.createDog());
        System.out.println(dogs.toString());
        HashSet<Object> pets = new HashSet<>(join(cats, dogs));
        System.out.println(pets.toString());
        removeCats(pets, cats);
        System.out.println(pets.toString());
    }
    public static HashSet<Object> join(HashSet<Cat> cats, HashSet<Dog> dogs){
        HashSet<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }
    public static void removeCats(HashSet<Object> set, HashSet<Cat> cats){
        ArrayList<Object> arrayList = new ArrayList<>(cats);
        HashSet<Object> copy = new HashSet<>(set);
        for (Object obj : copy){
            for (int i = 0; i < arrayList.size(); i++) {
                if (obj.equals(arrayList.get(i))){
                    set.remove(obj);
                }
            }
        }
    }
    public static class Cat{
        public static HashSet<Cat> createCats(){
            HashSet<Cat> cats = new HashSet<>();
            cats.add(new Cat());
            cats.add(new Cat());
            cats.add(new Cat());
            cats.add(new Cat());
            return cats;
        }
    }
    public static class Dog{
        public static HashSet<Dog> createDog(){
            HashSet<Dog> dogs = new HashSet<>();
            dogs.add(new Dog());
            dogs.add(new Dog());
            dogs.add(new Dog());
            return dogs;
        }
    }
}
