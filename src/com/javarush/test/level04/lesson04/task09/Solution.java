package com.javarush.test.level04.lesson04.task09;

/* Светофор
Работа светофора для пешеходов запрограммирована следующим образом: в начале каждого часа в течение трех минут горит зеленый сигнал,
затем в течение одной минуты — желтый, а потом в течение одной минуты — красный, затем опять зеленый горит три минуты и т. д.
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
Результат вывести на экран в следующем виде:
"зеленый" - если горит зеленый цвет, "желтый" - если горит желтый цвет, "красный" - если горит красный цвет.
Пример для числа 2.5:
зеленый
Пример для числа 3:
желтый
Пример для числа 4:
красный
Пример для числа 5:
зеленый
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String minute_ = reader.readLine();
        double minute = Double.parseDouble(minute_);

        checkColor(minute);
    }

    public static void checkColor(double minute) {
        double rest;
        if (minute >= 5) rest = minute % 5;
        else rest = minute;

        if (rest >= 0.0 & rest < 3.0) System.out.println("зеленый");
        else if (rest >= 3.0 & rest < 4.0) System.out.println("желтый");
        else if (rest >= 4.0 & rest < 5.0) System.out.println("красный");

    }
}