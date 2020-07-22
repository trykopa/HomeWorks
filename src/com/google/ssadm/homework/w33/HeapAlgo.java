package com.google.ssadm.homework.w33;

// Существует массив {1,2,3,4,5} — размер массива может быть произвольным.
// Напишите программу которая выведет на экран все возможные комбинации
// из этих цифр. Внимание повторений быть не должно.

import java.util.Arrays;

public class HeapAlgo {
    final static int[] array = {1,2,3,4,5};
    private static int count = 0;

    public static void main(String[] args) {
        heapPermutation(array, array.length, array.length);
    }

    public static void printResArray(int[] a) {
        Arrays.stream(a).mapToObj(j -> j + " ").forEach(System.out::print);
        count++;
        System.out.println(" step " + count);
    }

    public static void heapPermutation(int[] array, int size, int n) {
        if (size == 1) printResArray(array);

        for (int i=0; i<size; i++) {
            heapPermutation(array, size-1, n);

            int temp;
            if (size % 2 == 1) {
                temp = array[0];
                array[0] = array[size-1];
            } else {
                temp = array[i];
                array[i] = array[size-1];
            }
            array[size-1] = temp;
        }
    }
}

