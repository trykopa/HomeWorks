package com.google.ssadm.homework.w21_40.w35;

import java.util.Arrays;
import java.util.stream.Collectors;

// Написать свой вариант метода Arrays.toString() для int[].
public class PrintArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(printArray(array));
        System.out.println(streamArrayToString(array));
    }

    //StringBuilder method
    private static String printArray(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for(int i = 0; i < array.length; i++){
            sb.append(i < array.length - 1 ? array[i] + ", " : array[i]);
        }
        sb.append("}");
        return sb.toString();
    }

    //Stream API method
    private static String streamArrayToString(int[] array) {
        return Arrays.stream(array).mapToObj(String::valueOf)
                .collect(Collectors.joining(", ", "{", "}"));
    }



}
