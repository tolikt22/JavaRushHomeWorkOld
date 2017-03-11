package com.javarush.test.level04.lesson16.home03;

import java.io.*;
import java.util.Scanner;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.
  -1 должно учитываться в сумме.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        while (true) {
//            Scanner scanner = new Scanner(System.in);
//            int n = scanner.nextInt();
            int n = Integer.parseInt(reader.readLine());
            sum = sum + n;
            if (n == -1) {
                System.out.print(sum);
                break;
            }
        }

    }
}
