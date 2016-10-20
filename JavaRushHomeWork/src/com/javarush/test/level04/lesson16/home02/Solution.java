package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a1 = Integer.parseInt(bufferedReader.readLine());
        int a2 = Integer.parseInt(bufferedReader.readLine());
        int a3 = Integer.parseInt(bufferedReader.readLine());
        if(a1 < a2 && a2 < a3)
            System.out.println(a2);
        if(a1 < a3 && a3 < a2)
            System.out.println(a3);
        if(a2 < a1 && a1 < a3)
            System.out.println(a1);
        if(a2 < a3 && a3 < a1)
            System.out.println(a3);
        if(a3 < a1 && a1 < a2)
            System.out.println(a1);
        if(a3 < a2 && a2 < a1)
            System.out.println(a2);

    }
}
