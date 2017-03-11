package com.javarush.test.level04.lesson06.task08;

/* Координатные четверти
Ввести с клавиатуры два целых числа, которые будут координатами точки, не лежащей на координатных осях OX и OY.
Вывести на экран номер координатной четверти, в которой находится данная точка.
Подсказка:
Принадлежность точки с координатами (a,b) к одной из четвертей определяется следующим образом:
для первой четверти a>0 и b>0;
для второй четверти a<0 и b>0;
для третьей четверти a<0 и b<0;
для четвертой четверти a>0 и b<0.
Пример для чисел 4 6:
1
Пример для чисел -6 -6:
3
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a_ = reader.readLine();
        String b_ = reader.readLine();
        int a = Integer.parseInt(a_);
        int b = Integer.parseInt(b_);

        int x = 0;
        if (a > 0)
        {
            if (b > 0) x = 1;
            else x = 4;
        }
        if (a < 0)
        {
            if (b > 0) x = 2;
            else x = 3;
        }

        System.out.println(x);

    }
}
