package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1,
вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        int i=0, s=0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (i != -1){
            i = Integer.parseInt(bufferedReader.readLine());
            s = s + i;
        }
        System.out.println(s);
    }
}
