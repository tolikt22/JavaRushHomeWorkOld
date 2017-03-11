package com.javarush.test.level07.lesson12.home06;
/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня   …*/
public class Solution
{
    public static void main(String[] args)
    {
     Human grF1 = new Human("Pedro",true,60);
     Human grF2 = new Human("Andrey",true,62);
     Human grM1 = new Human("Odarka",false,56);
     Human grM2 = new Human("Paraska",false,58);
     Human father1 = new Human("Sergey",true,40,grF1,grM1);
     Human mother1 = new Human("Miuzetta",false,38,grF2,grM2);
     Human son = new Human("Ivanko", true,10,father1,mother1);
     Human daughter = new Human("Marynka", false,7,father1,mother1);
     Human daughter1 = new Human("Petra", false,4,father1,mother1);

        System.out.println(grF1);
        System.out.println(grF2);
        System.out.println(grM1);
        System.out.println(grM2);
        System.out.println(father1);
        System.out.println(mother1);
        System.out.println(son);
        System.out.println(daughter);
        System.out.println(daughter1);
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father, mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
