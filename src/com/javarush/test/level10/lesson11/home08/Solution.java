package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Создать массив, элементами которого будут списки строк");
        list1.add("Создать массив, элементами которого будут спискdfsdgfи строк");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Создать массив, элементами которого будут списки строк");
        list2.add("Создать массив, элементами которого будут спискdfsdgfи строк");

        ArrayList<String>[] arrayList  = new ArrayList[2];
        arrayList[0]=list1;
        arrayList[1]=list2;
        return arrayList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}