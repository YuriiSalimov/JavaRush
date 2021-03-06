package com.javarush.test.level04.lesson16.home04;

import java.util.Scanner;

/**
 * Меня зовут 'Вася'...
 * Ввести с клавиатуры строку name.
 * Ввести с клавиатуры дату рождения (три числа): y, m, d.
 * Вывести на экран текст:
 * «Меня зовут name
 * Я родился d.m.y»
 * Пример:
 * Меня зовут Вася
 * Я родился 15.2.1988
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        final String message = "Меня зовут %s\nЯ родился %d.%d.%d";
        final Scanner scanner = new Scanner(System.in);
        final String name = scanner.next();
        final int y = scanner.nextInt();
        final int m = scanner.nextInt();
        final int d = scanner.nextInt();
        System.out.println(create(message, name, d, m, y));
    }

    private static String create(final String pattern, final Object... objects) {
        return String.format(pattern, objects);
    }
}
