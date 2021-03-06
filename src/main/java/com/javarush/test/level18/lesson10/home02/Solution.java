package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран частоту встречания пробела. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
Закрыть потоки
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        final String fileName = args[0];
        try (FileInputStream fileInputStream = new FileInputStream(fileName))
        {
            byte[] buffer = new byte[fileInputStream.available()];
            if (fileInputStream.available() > 0)
            {
                fileInputStream.read(buffer);
            }
            int charCount = buffer.length;
            int spaceCount = 0;
            for (byte aBuffer : buffer)
            {
                if (aBuffer == 32)
                    spaceCount++;
            }
            double x = ((double) spaceCount / (double) charCount) * 100;
            System.out.println(String.format("%.2f", x));
        }
    }
}
