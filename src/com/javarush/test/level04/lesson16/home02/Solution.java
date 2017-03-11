package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n1_ = reader.readLine();
        String n2_ = reader.readLine();
        String n3_ = reader.readLine();
        int n1 = Integer.parseInt(n1_);
        int n2 = Integer.parseInt(n2_);
        int n3 = Integer.parseInt(n3_);

        System.out.println(middle(n1, n2, n3));
    }

    public static int middle(int n1, int n2, int n3) {
        int middleNumber = 0;
        if ((n1 > n2 & n1 < n3) || (n1 < n2 & n1 > n2)) middleNumber = n1;
        else if ((n2 > n1 & n2 < n3) || (n2 < n1 & n2 > n3)) middleNumber = n2;
        else if ((n3 > n1 & n3 < n2) || (n3 < n1 & n3 > n2)) middleNumber = n3;
        return middleNumber;
    }
}
