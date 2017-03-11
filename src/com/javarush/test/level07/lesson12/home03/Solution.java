package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int n = Integer.parseInt(reader.readLine());
            list.add(n);
        }
        System.out.println(findMax(list) + " " + findMin(list));
        //напишите тут ваш код
    }

    public static int findMax(ArrayList list) {
        int maximum = (int) list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if ((int) list.get(i) > maximum) maximum = (int) list.get(i);
        }
        return maximum;
    }

    public static int findMin(ArrayList list) {
        int minimum = (int) list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (minimum > (int) list.get(i)) minimum = (int) list.get(i);
        }
        return minimum;
    }
}

