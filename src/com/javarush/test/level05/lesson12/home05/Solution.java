package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int current = 0;
        while (true) {
            String n_ = reader.readLine();
            if (n_.equals("сумма")) {
                System.out.println(current);
                break;
            }
            int n = Integer.parseInt(n_);
            current = current + n;
        }
    }
}
