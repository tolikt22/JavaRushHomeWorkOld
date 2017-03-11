import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Tmp {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        String[] strings = new String[array.length]; // массив для стрингов
        int[] ints = new int[array.length];   //массив для интов

        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                ints[i] = Integer.parseInt(array[i]);
                strings[i]="";
            } else {
                strings[i] = array[i];
            }
        }
        bubbleSortInts(ints);
        bubbleSortStrings(strings);

//        for (int i = 0; i < ints.length; i++) {
//            System.out.println(ints[i]);
//            System.out.println(strings[i]);
//        }

        for (int i = 0; i < array.length; i++) {
            if (strings[i]==null) {
                array[i] = String.valueOf(ints[i]);
            } else {
                array[i] = strings[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    //Метод пузырьковой сортировки int-ов
    public static int[] bubbleSortInts(int[] in) {
        int[] sorted = in;
        for (int i = sorted.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (sorted[j] < sorted[j + 1]) {
                    int min = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = min;
                }
            }
        }
        return sorted;
    }

    //Метод пузырьковой сортировки String-ов
    public static String[] bubbleSortStrings(String[] in) {
        String[] sorted = in;
        for (int i = sorted.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (isGreaterThan(sorted[j].toLowerCase(),sorted[j+1].toLowerCase())) {
                    String max = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = max;
                }
            }
        }
        return sorted;
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
