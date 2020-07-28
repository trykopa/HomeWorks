package com.google.ssadm.homework.w1_20.w17;

// С помощью циклов вывести на экран все простые числа от 1 до 100.
// Простое число — число которое делиться нацело только на единицу или
// само на себя. Первые простые числа это — 2,3,5,7...

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int target = 100;
        for(int i = 2; i <= target; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
            if(isPrime2(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int check){
        return IntStream.rangeClosed(2, check / 2).noneMatch(i -> check % i == 0);
    }

    public static boolean isPrime2(int check){
        if (check != 2 && check != 3) {
            for (int i = 2; i <= Math.sqrt(check); i++)
                if (check % i == 0) return false;
        }
        return true;
    }
}
