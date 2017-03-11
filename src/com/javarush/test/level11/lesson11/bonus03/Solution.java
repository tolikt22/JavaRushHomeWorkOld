package com.javarush.test.level11.lesson11.bonus03;

/* Задача по алгоритмам
Написать метод, который возвращает минимальное и максимальное числа в массиве.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("Minimum is " + result.x);
        System.out.println("Maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] array)
    {
        if (array == null || array.length == 0)
        {
            return new Pair<Integer, Integer>(null, null);
        }

        int max=array[0],min=array[0];
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i+1]){
                max=array[i];
                array[i]=array[i+1];
                array[i+1]=max;
            }
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (min > array[i + 1]){
                min=array[i+1];
//                array[i]=array[i+1];
//                array[i+1]=min;
            }
        }

        return new Pair<Integer, Integer>(min, max);
    }


    public static class Pair<X, Y>
    {
        public X x;
        public Y y;

        public Pair(X x, Y y)
        {
            this.x = x;
            this.y = y;
        }
    }
}
