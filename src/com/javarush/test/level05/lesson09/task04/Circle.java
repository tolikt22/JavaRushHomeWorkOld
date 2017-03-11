package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle {
    int x, y, radius, width;
    String color;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(int x, int y, int radius, int width) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.width = width;
    }

    public Circle(int x, int y, int radius, int width, String color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }
}
