package com.google.ssadm.homework.w3;

//3)Написать программу которая вычислит и выведет на экран длину
// окружности, если ее радиус считывается с клавиатуры.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double r,c;
        System.out.println("Enter please circle radius (ex-0,5): ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextDouble()){
            r = sc.nextDouble();
            c = 2*Math.PI*r;
            System.out.printf("Сircle length with radius %f is %f", r, c);

        } else {
            System.out.println("You entered the wrong data, try again.");
        }
    }
}
