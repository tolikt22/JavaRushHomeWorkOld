package com.javarush.test.level08.lesson08.task05;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.*/
public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Petrov1", "Ivan");
        map.put("Petrov2", "Pedro");
        map.put("Petrov3", "Vasyl");
        map.put("Petrov4", "Alesha");
        map.put("Petrov5", "Miho");
        map.put("Petrov6", "Sydir");
        map.put("Petrov7", "Ivasyk");
        map.put("Petrov8", "Drunya");
        map.put("Petrov9", "Sydir");
        map.put("Petrov10", "Sydir");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap<>(map);
        for (String value : copy.values())
            if (Collections.frequency(copy.values(), value) > 1)
                removeItemFromMapByValue(map, value);
//        return copy;
    }


    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
//            System.out.println(copy);
        }
//        return copy;
    }

    public static void main(String[] args) {
        HashMap<String,String> tmp = createMap();
        removeTheFirstNameDuplicates(tmp);
        System.out.println(tmp);

    }
}
