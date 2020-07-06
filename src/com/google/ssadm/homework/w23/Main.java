package com.google.ssadm.homework.w23;

// «Перевернуть массив».
// Т.е. написать программу которая повернет базовый массив
// на 90,180,270 градусов по часовой стрелке. (При выполнении
// задания использовать дополнительный массив нельзя).
// В примере показан поворот на 90 градусов

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] myArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Original matrix:");
        printMatrix(myArray);

        System.out.println("Select angle to rotate matrix: 1-90, 2-180, 3-270 (enter 1 or 2 or 3)");
        Scanner sc = new Scanner(System.in);
        int angle = sc.nextInt();

        switch (angle) {
            case 1 -> {
                System.out.println("Selected angle - 90");
                rotateMatrix(myArray, angle);
                printMatrix(myArray);
            }
            case 2 -> {
                System.out.println("Selected angle - 180");
                rotateMatrix(myArray, angle);
                printMatrix(myArray);
            }
            case 3 -> {
                System.out.println("Selected angle - 270");
                rotateMatrix(myArray, angle);
                printMatrix(myArray);
            }
            default -> System.out.println("Incorrect input");
        }
    }

    private static void rotateMatrix(int[][] myArray, int angle) {
        int n = myArray.length;
        for(int k = 0; k < angle; k++) {
            int tmp;
            for(int i = 0;i < n/2; i++) {
                for(int j = i; j < n-1-i; j++) {
                    tmp = myArray[i][j];
                    myArray[i][j] = myArray[n-j-1][i];
                    myArray[n-j-1][i] = myArray[n-i-1][n-j-1];
                    myArray[n-i-1][n-j-1] = myArray[j][n-i-1];
                    myArray[j][n-i-1] = tmp;
                }
            }
        }
    }

    private static void printMatrix(int[][] myArray) {
        for (int[] ints : myArray) {
            for (int j = 0; j < myArray.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
