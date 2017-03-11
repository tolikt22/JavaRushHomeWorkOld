package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle {
    int x, y, radius, width;
    String color;

    public void initialize(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void initialize(int x, int y, int radius, int width) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.width = width;
    }

    public void initialize(int x, int y, int radius, int width, String color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }

}
