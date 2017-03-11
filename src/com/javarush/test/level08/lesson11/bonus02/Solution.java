package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи         */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //adding map of pairs
        HashMap<String, String> cityFamily = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String family = reader.readLine();
            if (family.isEmpty()) break;
            cityFamily.put(city, family);
//            System.out.println(cityFamily.entrySet());
        }

        //read city and check
        String cityToFind = reader.readLine();
        for (Map.Entry<String, String> pair : cityFamily.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            if (key.equals(cityToFind)) {
                System.out.println(value);
            }
        }
    }
}
