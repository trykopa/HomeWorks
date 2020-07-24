package com.google.ssadm.homework.w21_40.w31;

// Существуют такие последовательности чисел
// 0,2,4,6,8,10,12
// 1,4,7,10,13
// 1,2,4,8,16,32
// 1,3,9,27
// 1,4,9,16,25
// 1,8,27,64,125
// Реализуйте программу которая выведет следующий член этой последовательности
// (либо подобной им). Например пользователь вводит строку
// 0,2,4,6,8,10,12 ответом программы должно быть число 14.

import java.util.Arrays;

public class Main {
    final static int[][] sequences = {
            {1, 2, 3, 4, 5, 6},
            {0, 2, 4, 6, 8, 10, 12},
            {1, 4, 7, 10, 13},
            {1, 2, 4, 8, 16, 32},
            {1, 3, 9, 27},
            {1, 4, 9, 16, 25},
            {1, 8, 27, 64, 125},
            {1, 4, 6, 12, 34, 69}
    };

    //target number
    final static int target = 5;

    public static void main(String[] args) {
        for (int[] sequence : sequences) {
            System.out.print(Arrays.toString(sequence) + " _ ");
            findNextInt(sequence);
        }

    }


    private static void findNextInt(int[] sequence) {
        int res = 0;
        res = checkArithmeticProgression(sequence, res);
        if(res == 0) {
            res = checkGeometricProgression(sequence, res);
        }
        if(res == 0) {
            res = checkPowerProgression(sequence, res);
        }
        System.out.println((res!=0) ? res : "- sequence not found");
    }

    //check for power progression
    private static int checkPowerProgression(int[] sequence, int res) {
        for (int i = 2; i <= target; i++){
            boolean test = false;
            for (int j = 0; j < sequence.length-1; j++){
                test = (int) Math.pow(j + 1, i) == sequence[j];
                if(!test) break;
            }
            if (test) {
                res = (int) Math.pow(sequence.length + 1, i);
                break;
            }
        }
        return res;
    }

    //check for geometric progression
    private static int checkGeometricProgression(int[] sequence, int res) {
        for (int i = 2; i <= target; i++){
            boolean test = false;
            for (int j = 0; j < sequence.length-1; j++){
                test = sequence[j + 1] / sequence[j] == i;
                if(!test) break;
            }
            if (test) {
                res = sequence[sequence.length - 1] * i;
                break;
            }
        }
        return res;
    }

    //check for arithmetic progression
    private static int checkArithmeticProgression(int[] sequence, int res) {
        for(int i = 1; i <= target; i++){
            boolean test = false;
            for (int j = 0; j < sequence.length-1; j ++){
                test = sequence[j + 1] - sequence[j] == i;
                if(!test) break;
            }
            if (test) {
                res = sequence[sequence.length - 1]+i;
                break;
            }
        }
        return res;
    }
}
