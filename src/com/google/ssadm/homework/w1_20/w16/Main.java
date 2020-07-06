package com.google.ssadm.homework.w1_20.w16;

import java.util.Scanner;

// С помощью цикла (только одного) нарисовать такую фигуру.
// Причем максимальная высота этой фигуры вводиться с клавиатуры
// (в примере максимальная высота - 4)
//  *
//  **
//  ***
//  ****
//  ***
//  **
//  *
public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter figure height:");
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();

        if(height >= 1){
            for (int i = 1; i<= height*2-1; i++){
                if (i<=height){
                    System.out.println(new String(new char[i]).replace("\0", "*"));
                } else {
                    System.out.println(new String(new char[height*2-i]).replace("\0", "*"));
                }
            }
        } else {
            System.out.println("Invalid input");
        }

    }
}
