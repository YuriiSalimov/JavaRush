package com.javarush.test.level08.lesson03.task01;

import java.util.*;

/**
 * HashSet из растений
 * Создать коллекцию HashSet с типом элементов String.
 * Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
 * Вывести содержимое коллекции на экран, каждый элемент с новой строки.
 * Посмотреть, как изменился порядок добавленных элементов.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final Set<String> plants = new HashSet<>();
        plants.add("арбуз");
        plants.add("банан");
        plants.add("вишня");
        plants.add("груша");
        plants.add("дыня");
        plants.add("ежевика");
        plants.add("жень-шень");
        plants.add("земляника");
        plants.add("ирис");
        plants.add("картофель");
        println(plants);
    }

    private static void println(final Set<String> plants) {
        plants.forEach(System.out::println);
    }
}
