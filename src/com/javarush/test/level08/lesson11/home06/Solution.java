package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
//        ArrayList<Human> youngChildren = new ArrayList<>();
//        Human son1 = new Human("Петенька", true, 10, new ArrayList<Human>());
//        Human son2 = new Human("Васенька", true, 8, new ArrayList<Human>());
//        Human daughter = new Human("Катенька", false, 6, new ArrayList<Human>());
//
//        youngChildren.add(son1);
//        youngChildren.add(son2);
//        youngChildren.add(daughter);
//
//        Human father = new Human("Pedro", true, 45, youngChildren);
//        Human mother = new Human("Zhorzhetta", false, 40, youngChildren);
//        ArrayList<Human> fatherChild = new ArrayList<>();
//        fatherChild.add(father);
//        ArrayList<Human> motherChild = new ArrayList<>();
//        motherChild.add(mother);
//        Human dadOfFather = new Human("Панкрат", true, 75, fatherChild);
//        Human grannyOfFather = new Human("Прасковья", false, 70, fatherChild);
//        Human dadOfMother = new Human("Прокоп", true, 76, motherChild);
//        Human grannyOfMother = new Human("Авдотья", false, 74, motherChild);
//
//        System.out.println(son1);
//        System.out.println(son2);
//        System.out.println(daughter);
//        System.out.println(father);
//        System.out.println(mother);
//        System.out.println(dadOfFather);
//        System.out.println(grannyOfFather);
//        System.out.println(dadOfMother);
//        System.out.println(grannyOfMother);

        //код FORIS
        ArrayList<Human> children = new ArrayList<Human>();
        ArrayList<Human> parents = new ArrayList<Human>();
        ArrayList<Human> grands = new ArrayList<Human>();


        children.add(new Human("kid1", true, 3, null));
        children.add(new Human("kid2", true, 4, null));
        children.add(new Human("kid3", true, 5, null));

        parents.add(new Human("Father", true, 25, children));
        parents.add(new Human("Mother", false, 25, children));

        grands.add(new Human("дедушка1", true, 50, parents));
        grands.add(new Human("дедушка2", true, 50, parents));
        grands.add(new Human("бабушка1", false, 50, parents));
        grands.add(new Human("бабушка2", false, 50, parents));

//        parents.addAll(children);
//        grands.addAll(parents);


        for (Human item : grands)
            System.out.println(item);
        for (Human item : parents)
            System.out.println(item);
        for (Human item : children)
            System.out.println(item);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
