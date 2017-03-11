package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String name, surName;
        int age, weight, height;
        boolean sex;

        public Human(String name, String surName, int age, int weight, int height, boolean sex) {
            this.name = name;
            this.surName = surName;
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.sex = sex;
        }

        public Human(String name, String surName, int age, int weight, int height) {

            this.name = name;
            this.surName = surName;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(String name, String surName, int age, int weight) {

            this.name = name;
            this.surName = surName;
            this.age = age;
            this.weight = weight;
        }

        public Human(String name, String surName, int age) {

            this.name = name;
            this.surName = surName;
            this.age = age;
        }

        public Human(String name, String surName) {

            this.name = name;
            this.surName = surName;
        }

        public Human(String name) {

            this.name = name;
        }

        public Human(String name, boolean sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, int height) {
            this.name = name;
            this.height = height;
        }

        public Human(String name, String surName, int height, boolean sex) {
            this.name = name;
            this.surName = surName;
            this.height = height;
            this.sex = sex;
        }

        public Human(int age) {
            this.age = age;
        }
    }
}
