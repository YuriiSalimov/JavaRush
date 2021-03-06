package com.javarush.test.level07.lesson04.task02;

import java.util.Scanner;

/**
 * Массив из строчек в обратном порядке
 * 1. Создать массив на 10 строчек.
 * 2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
 * 3. Вывести содержимое всего массива (10 элементов)
 * на экран в обратном порядке. Каждый элемент - с новой строки.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final String[] array = new String[10];
        scan(array, 8);
        printRevers(array);
    }

    private static void scan(final String[] array, final int length) {
        final Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextLine();
        }
    }

    private static void printRevers(final String[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}