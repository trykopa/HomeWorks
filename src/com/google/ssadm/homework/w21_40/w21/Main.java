package com.google.ssadm.homework.w21_40.w21;

// Создать массив случайных чисел (размером 15 элементов).
// Создайте второй массив в два раза больше,
// первые 15 элементов должны быть равны элементам первого массива,
// а остальные элементы заполнить удвоенных значением начальных. Например
// Было → {1,4,7,2}
// Стало → {1,4,7,2,2,8,14,4}

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    final static int range = 100; //random int numbers range
    final static int arraySize = 15; //array size

    public static void main(String[] args) {

        int[] myArray = new int[arraySize];
        IntStream.range(0, myArray.length)
                .forEach(i -> myArray[i] = new Random().nextInt(range));
        System.out.println("myArray - " + Arrays.toString(myArray));

        int[] newArray = Arrays.copyOf(myArray, myArray.length * 2);
        IntStream.range(myArray.length, newArray.length)
                .forEach(i -> newArray[i] = myArray[i - myArray.length] * 2);
        System.out.println("newArray - " + Arrays.toString(newArray));
    }
}
