package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n1_ = reader.readLine();
        String n2_ = reader.readLine();
        String n3_ = reader.readLine();
        int n1 = Integer.parseInt(n1_);
        int n2 = Integer.parseInt(n2_);
        int n3 = Integer.parseInt(n3_);

        int maximum = max(n1, n2, n3);
        int minimum = min(n1, n2, n3);
        int middle = mid(n1,n2,n3,maximum,minimum);

        System.out.println(maximum);
        System.out.println(middle);
        System.out.println(minimum);
    }

    public static int max(int n1, int n2, int n3) {
        int max;
        if (n1 > n2 && n1 > n3)
            max = n1;
        else if (n2 > n1 && n2 > n3)
            max = n2;
        else max = n3;
        return max;
    }

    public static int min(int n1, int n2, int n3) {
        int min;
        if (n1 < n2 && n1 < n3)
            min = n1;
        else if (n2 < n1 && n2 < n3)
            min = n2;
        else min = n3;
        return min;
    }

    public static int mid(int n1, int n2, int n3,int maximum, int minimum) {
        int mid;
        if (n1 != maximum && n1 != minimum)
            mid = n1;
        else if (n2 != maximum && n2 != minimum)
            mid = n2;
        else mid = n3;
        return mid;
    }

}
