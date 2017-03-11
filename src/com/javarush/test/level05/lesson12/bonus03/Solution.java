package com.javarush.test.level05.lesson12.bonus03;
import java.io.*;
/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.*/
public class Solution {
    public static void main(String[] args) throws Exception {
        int maximum;
        int maxIndex=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < x.length; i++) {
            if (x[maxIndex] < x[i]) maxIndex = i;
        }

        maximum = x[maxIndex];
        System.out.println(maximum);
    }
}
