package com.google.ssadm.homework.w21_40.w26;

//Напишите метод который вернет максимальное число из массива целых чисел.

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        Arrays.setAll(array, i -> ThreadLocalRandom.current().nextInt(-100, 100 + 1));
        System.out.println("We have this array: " + Arrays.toString(array));
        //first
        System.out.println("Maximum digit is: " + findMaxIntFromArray(array));
        //second
        System.out.println("Maximum digit is: " + Arrays.stream(array).max().getAsInt());
    }

    private static int findMaxIntFromArray(int[] array) {
        int max = Integer.MAX_VALUE +1;
        for (int elem: array){
            if(elem > max) {
                max = elem;
            }
        }
        return max;
    }
}
