package com.google.ssadm.homework.w21_40.w40;

// Little Johnny was sitting in a lesson writing the same numbers in a row.
// When the teacher Marya took the notebook from him there were several rows
// of numbers. Write a program that will determine the minimum number that
// Johnny wrote for example:
// 11111111 => 1
// 12121212 => 12
// 121121121 => 121

import java.util.Arrays;

public class Sequences {
    final static int[] array = {
            12321,
            11111111,
            12121212,
            121121121,
            1232112321
    };

    public static void main(String[] args) {
        Arrays.stream(array).forEachOrdered(i ->
                System.out.printf("Number %d is sequence of %d %n" , i , findSequence(i)
                )
        );
    }

    private static int findSequence(int number) {
        String test = String.valueOf(number);
        String finalSequence = test;
        for (int i = test.length()/2; i >= 1; i--) {
            if (test.length()%i==0) {
                String str1 = test.substring(0,i);
                StringBuilder tmp = new StringBuilder();
                tmp.append(str1.repeat(test.length() / i));
                if (tmp.toString().equals(test)) {
                    finalSequence = str1;
                }
            }
        }
        return Integer.parseInt(finalSequence);
    }


}
