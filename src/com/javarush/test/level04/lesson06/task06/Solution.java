package com.javarush.test.level04.lesson06.task06;

/* И 18-ти достаточно
Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно».
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        final Scanner scan = new Scanner(System.in);
        final String name = scan.nextLine();
        final int age = scan.nextInt();
        if (age > 20)
        {
            System.out.println("И 18-ти достаточно");
        }
    }
}
