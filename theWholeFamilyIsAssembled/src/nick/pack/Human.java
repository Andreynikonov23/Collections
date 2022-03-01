package nick.pack;

import java.util.ArrayList;
import java.util.Collections;

public class Human {
    private String name;
    private boolean gender;
    private int age;
    private ArrayList<Human> children;

    public Human(){}
    public Human(String name, boolean gender, int age, Human child1, Human child2, Human child3){
        this.name = name;
        this.gender = gender;
        this.age = age;
        children = new ArrayList<>();
        children.add(child1);
        children.add(child2);
        children.add(child3);
    }
    public Human(String name, boolean gender, int age, Human child){
        this.name = name;
        this.gender = gender;
        this.age = age;
        children = new ArrayList<>();
        children.add(child);
    }
    public Human(String name, boolean gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
        children = new ArrayList<>();
    }
    public String toString(){
        String str = null;
        if (children.isEmpty()){
            str = String.format("Имя: %s; Пол: %b; Возраст: %d; Дети: нет детей", name, gender, age);
        } else if (children.size() > 1) {
            str = "Имя:" + name + "; Пол:" + gender + "; Возраст:" + age + "; Дети: " + children.get(0).name + ", " + children.get(1).name + ", " + children.get(2).name;
        } else {
            str = "Имя:" + name + "; Пол:" + gender + "; Возраст:" + age + "; Дети: " + children.get(0).name;
        }
        return str;
    }
}
