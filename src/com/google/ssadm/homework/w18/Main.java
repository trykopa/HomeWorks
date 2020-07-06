package com.google.ssadm.homework.w18;
//Выведите на экран «песочные часы» максимальная ширина которых
//считывается с клавиатуры (число нечетное). В примере ширина равна 5.
//    *****
//     ***
//      *
//     ***
//    *****

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter please sand clock height");
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();

        for(int i = 1; i <= height; i++){
            for(int j = 1; j <= height; j++){
                if (i <= height/2 +1) {
                    System.out.print((j >= i && j <= height - i + 1) ? "*" : " ");
                } else {
                    System.out.print((j <= height - i) || (j > height - (height-i)) ? " " : "*");
                }
            }
            System.out.println();
        }
    }
}
