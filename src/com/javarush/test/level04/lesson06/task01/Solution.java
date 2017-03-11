package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n1_ = reader.readLine();
        int n1 = Integer.parseInt(n1_);
        String n2_ = reader.readLine();
        int n2 = Integer.parseInt(n2_);

//        Scanner scanner = new Scanner(System.in);
//        int n2 = scanner.nextInt();

        if (n1<n2) System.out.println(n1);
        else System.out.println(n2);

//        System.out.println(Math.min(n1,n2));

    }
}