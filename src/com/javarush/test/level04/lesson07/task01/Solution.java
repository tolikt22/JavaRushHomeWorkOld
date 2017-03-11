package com.javarush.test.level04.lesson07.task01;

/* Строка - описание
Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
«отрицательное четное число» - если число отрицательное и четное,
«отрицательное нечетное число» - если число отрицательное и нечетное,
«нулевое число» - если число равно 0,
«положительное четное число» - если число положительное и четное,
«положительное нечетное число» - если число положительное и нечетное.
Пример для числа 100:
положительное четное число
Пример для числа -51:
отрицательное нечетное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String x_ = reader.readLine();
        int x = Integer.parseInt(x_);

        String gMinusPlusZero, chetNechet;
        String number = "число";

        if (x < 0) gMinusPlusZero = "отрицательное ";
        else if (x > 0) gMinusPlusZero = "положительное ";
        else gMinusPlusZero = "нулевое ";

        if (x == 0) chetNechet = "";
        else if (x % 2 == 0) chetNechet = "четное ";
        else chetNechet = "нечетное ";

        System.out.println(gMinusPlusZero + chetNechet + number);

    }
}
