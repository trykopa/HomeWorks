package com.google.ssadm.homework.w1_20.w15;
// Выведите на экран прямоугольник из *.
// Причем высота и ширина прямоугольника вводятся с клавиатуры.
// Например ниже представлен прямоугольник с высотой 4 и шириной 5.
// *****
// *   *
// *   *
// *****
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Please enter rectangle width (1,2,3 etc)");
        int width = sc.nextInt();
        System.out.println( "Please enter rectangle height(1,2,3 etc)");
        int height = sc.nextInt();
        if(height > 0 & width > 0){
            for (int i = 0; i < height; i++){
                for(int j = 0; j < width; j++) {
                    System.out.print((i == 0 || i == height - 1) || (j == 0 || j == width - 1) ? "*" : " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid input");
        }

    }
}
