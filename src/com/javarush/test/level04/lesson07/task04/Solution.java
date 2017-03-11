package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a_ = reader.readLine();
        String b_ = reader.readLine();
        String c_ = reader.readLine();
        int a = Integer.parseInt(a_);
        int b = Integer.parseInt(b_);
        int c = Integer.parseInt(c_);

        int x = 0;
        int y = 0;
        if (a > 0) x += 1;
        else y += 1;
        if (b > 0) x += 1;
        else y += 1;
        if (c > 0) x += 1;
        else y += 1;

        System.out.println("количество отрицательных чисел: " + y);
        System.out.println("количество положительных чисел: " + x);
    }
}
