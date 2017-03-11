package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] n = new int[5];

        for (int i = 0; i < 5; i++) {
            n[i] = Integer.parseInt(reader.readLine());
        }

        for (int j = n.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (n[i] > n[i+1]) {
                    int max = n[i];
                    n[i] = n[i+1];
                    n[i+1] = max;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
//            System.out.println(n[i]);
        }

    }
}
