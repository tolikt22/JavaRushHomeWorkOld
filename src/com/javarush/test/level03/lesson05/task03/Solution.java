package com.javarush.test.level03.lesson05.task03;

/* Конвертер времени
Добавьте метод public static int convertToSeconds(int hour) который будет конвертировать часы в секунды.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
*/

public class Solution
{

    public static int convertToSeconds (int hour){
        int seconds = hour*60*60;
        return seconds;
    }

    public static void main(String[] args) {
        int qw = convertToSeconds(3);
        int ew = convertToSeconds(2);
        System.out.println(qw);
        System.out.println(ew);
    }
}