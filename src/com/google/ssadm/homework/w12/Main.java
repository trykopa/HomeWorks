package com.google.ssadm.homework.w12;

import java.util.Scanner;

//С помощью циклов нарисовать «обои». Причем количество полос должно вводиться с клавиатуры.
// В примере 7 полос.
// ***+++***+++***+++***
// ***+++***+++***+++***
// ***+++***+++***+++***
// ***+++***+++***+++***
// ***+++***+++***+++***
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter lines count: ");
        int lines = scan.nextInt();
        for(int i = 0; i < 5; i++){
            for(int j = 1; j <= lines; j++){
                System.out.print( j % 2 != 0 ? "***" : "+++");
            }
            System.out.println();
        }
    }
}
