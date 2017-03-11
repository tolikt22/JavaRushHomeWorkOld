package com.javarush.test.level05.lesson12.home02;
/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].*/
public class Solution
{
    public static void main(String[] args)
    {
        Man man1 = new Man("Pedro", "BakerStreet",40);
        Man man2 = new Man("Ivan", "Balakina",42);

        Woman woman1 = new Woman("Katyuha", "Bandery",37);
        Woman woman2 = new Woman("Tanyuha", "Petlyury",35);

        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);
    }

    public static class Man {
        String name, address;
        int age;

        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }

        public Man(String name, String address, int age) {
            this.name = name;
            this.address = address;
            this.age = age;
        }

        public Man(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public Man(String name) {
            this.name = name;
        }
    }
    public static class Woman {
        String name, address;
        int age;

        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }

        public Woman(String name, String address, int age) {
            this.name = name;
            this.address = address;
            this.age = age;
        }

        public Woman(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public Woman(String name) {
            this.name = name;
        }
    }
}
