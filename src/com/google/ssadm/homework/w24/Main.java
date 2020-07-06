package com.google.ssadm.homework.w24;

import java.util.Arrays;

// Написать код для зеркального переворота массива (7,2,9,4) -> (4,9,2,7).
// - массив может быть произвольной длинны.
// (При выполнении задания использовать дополнительный массив нельзя)
public class Main {
    public static void main(String[] args) {
        int[] myArray = {7, 2, 9, 4};
        System.out.println("Original array: " + Arrays.toString(myArray));
        for (int i = 0; i < myArray.length / 2; i++) {
            int tmp = myArray[i];
            myArray[i] = myArray[myArray.length-i-1];
            myArray[myArray.length-i-1] = tmp;
        }
        System.out.println("Reversed array: " + Arrays.toString(myArray));
    }
}
