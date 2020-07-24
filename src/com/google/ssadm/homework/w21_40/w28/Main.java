package com.google.ssadm.homework.w21_40.w28;

// Реализуйте метод рисующий на экране прямоугольник из звездочек «*»
// — его параметрами будут целые числа которые описывают длину и
// ширину такого прямоугольника.

public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        printRectangle(a, b);
    }

    private static void printRectangle(int a, int b) {
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                System.out.print(((i == 0) || (j == 0) || (i == (a - 1)) || (j == (b - 1))) ? "*" : " ");
            }
            System.out.println();
        }
    }
}
