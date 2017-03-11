package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

//    public static void main(String[] args) {
//        Cat cat1 = new Cat("Pedro", 6, 7, 15);
//        Cat cat2 = new Cat("Murzabek", 4, 6, 12);
//        cat1.fight(cat2);
//        System.out.println(cat1.fight(cat2));
//    }

    public boolean fight(Cat anotherCat) {
        int str = 0;
        int wei = 0;
        int ag = 0;
        boolean t=false;
        if (this.strength > anotherCat.strength) str = 1 ;
        if (this.weight > anotherCat.weight) wei = 1 ;
        if (this.age > anotherCat.age) ag = 1 ;
        if(str+wei+ag>=2) {
            t = true;
        }
        return t;
    }
}
