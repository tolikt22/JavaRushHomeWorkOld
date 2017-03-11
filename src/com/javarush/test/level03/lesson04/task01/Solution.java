package com.javarush.test.level03.lesson04.task01;

/* Дата рождения
Вывести на экран дату своего рождения в виде: MAY 1 2012
*/

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Solution
{
    public static void main(String[] args)
    {
        GregorianCalendar date = new GregorianCalendar (1975,11,16);
        DateFormat dateFormat = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
        System.out.println(dateFormat.format(date.getTime()).toUpperCase());
    }
}