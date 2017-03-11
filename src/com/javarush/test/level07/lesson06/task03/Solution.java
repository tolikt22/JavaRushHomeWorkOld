package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        int min = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
            if (list.get(i).length()>min) {
                min=list.get(i).length();
            }
        }

        ArrayList<String> output = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < min) {
                min = list.get(i).length();
                output.removeAll(output);
                output.add(list.get(i));
            } else if (list.get(i).length() == min) {
                output.add(list.get(i));
            }
        }
        for (int i = 0; i < output.size(); i++) {
            System.out.println(output.get(i));
        }
    }
}

