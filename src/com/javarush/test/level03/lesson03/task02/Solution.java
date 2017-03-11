package com.javarush.test.level03.lesson03.task02;

/* Конвертер валют
Реализуйте метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс
*/
public class Solution
{
    public static void main(String[] args) {
        System.out.println( convertEurToUsd(20,1.3));
        System.out.println( convertEurToUsd(30,1.05));
    }

    public static double convertEurToUsd(int eur, double course){
        int s = (int) (eur*course);
        return s;
    }
}
