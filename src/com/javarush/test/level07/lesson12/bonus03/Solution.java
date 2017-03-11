package com.javarush.test.level07.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {//сортировка в обратном порядке пузырьком
        int min;
        for (int i = 0; i < array.length; i++) {
            int j = array.length - 1;
            for (int k = 0; k < j; k++) {
                min = array[k];
                if (array[k] < array[k + 1]) {
                    array[k] = array[k + 1];
                    array[k + 1] = min;
                }
            }
        }
    }
//    public static void sort(int[] array) {//сортировка обычная пузырьком
//        int max;
//        for (int i = 0; i < array.length; i++) {
//            int j = array.length - 1;
//            for (int k = 0; k < j; k++) {
//                max = array[k];
//                if (array[k] > array[k + 1]) {
//                    array[k] = array[k + 1];
//                    array[k + 1] = max;
//                }
//            }
//        }
//    }
}
