package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a1 = Integer.parseInt(bufferedReader.readLine());
        int a2 = Integer.parseInt(bufferedReader.readLine());
        int a3 = Integer.parseInt(bufferedReader.readLine());
        int i;
        if(a3 > a2) {
            i = a2;
            a2 = a3;
            a3 = i;
        }
        if (a2 > a1){
            i = a1;
            a1 = a2;
            a2 = i;
        }
        if(a3 > a2) {
            i = a2;
            a2 = a3;
            a3 = i;
        }
        System.out.println(a1 + " " + a2 + " " + a3);

    }
}
