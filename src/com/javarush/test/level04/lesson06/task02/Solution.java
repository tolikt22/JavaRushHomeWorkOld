package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n1_ = reader.readLine();
        String n2_ = reader.readLine();
        String n3_ = reader.readLine();
        String n4_ = reader.readLine();
        int n1 = Integer.parseInt(n1_);
        int n2 = Integer.parseInt(n2_);
        int n3 = Integer.parseInt(n3_);
        int n4 = Integer.parseInt(n4_);

        if ((n1 > n2) && (n1 > n3) && (n1 > n4))
            System.out.println(n1);
        else if ((n2 > n3) && (n2 > n4)) {
            System.out.println(n2);
        } else if (n3 > n4) {
            System.out.println(n3);
        } else {
            System.out.println(n4);
        }

//        int maximum = n1;
//        if (n1 <= n2) {
//            maximum = n2;
//            if (n2 <= n3) {
//                maximum = n3;
//                if (n3 <= n4) {
//                    maximum = n4;
//                }
//            }
//        } System.out.println(maximum);
    }
}
