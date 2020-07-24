package com.google.ssadm.homework.w21_40.w32;

// Число-палиндром с обеих сторон (справа налево и слева направо)
// читается одинаково. Самое большое число-палиндром, полученное
// умножением двух двузначных чисел – 9009 = 91 × 99.
// Найдите самый большой палиндром, полученный умножением двух трехзначных чисел.

public class Main {
    public static void main(String[] args) {
        int max = 0;
        int imax = 0;
        int jmax = 0;
        for(int i = 900; i<1000; i++){
            for(int j = 900; j<1000; j++){
                if (isPalindrome(i * j) && i * j > max) {
                    max = i * j;
                    imax = i;
                    jmax = j;
                }
            }
        }
        System.out.println(max + " i:" + imax + " j:" + jmax);
    }

    private static boolean isPalindrome(int i) {
        return String.valueOf(i).equals(new StringBuilder(String.valueOf(i)).reverse().toString());
    }
}
