package nick.pack;

public class Main {
    /*
    1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
    2. Создай объекты и заполни их так, чтобы получилось:
        два дедушки, две бабушки, отец, мать, трое детей.
    3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).
     */
    public static void main(String[] args) {
    Human child1 = new Human("Андрей", true, 20);
    Human child2 = new Human("Никита", true, 12);
    Human child3 = new Human("Лиза", false, 4);
    Human father = new Human("Владимир", true, 38, child1, child2, child3);
    Human mother = new Human("Галина", false, 37, child1, child2,child3);
	Human grandfather1 = new Human("Владимир", true, 72, father);
    Human grandfather2 = new Human("Владимир", true, 65, mother);
    Human grandmother1 = new Human("Юлия", false, 71, father);
    Human grandmother2 = new Human("Валентина", false, 66, mother);
    System.out.println(grandfather1);
    System.out.println(grandfather2);
    System.out.println(grandmother1);
    System.out.println(grandmother2);
    System.out.println(father);
    System.out.println(mother);
    System.out.println(child1);
    System.out.println(child2);
    System.out.println(child3);
    }
}
