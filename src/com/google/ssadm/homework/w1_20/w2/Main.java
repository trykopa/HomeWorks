package com.google.ssadm.homework.w1_20.w2;

//2)Написать программу которая вычислит и выведет на экран площадь треугольника если известны его стороны.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean key = false;
        while (!key) {
            double a, b, c;
            System.out.println("Please enter lengths of all sides of a triangle");
            System.out.println("Enter side a: ");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextDouble()) {
                a = sc.nextDouble();
                System.out.println("Enter side b: ");
                b = sc.nextDouble();
                System.out.println("Enter side c: ");
                c = sc.nextDouble();
                if(((a+b)>c)&((a+c)>b)&((b+c)>a)){
                    double hp = (a + b + c)/2d;
                    double s = Math.sqrt(hp*(hp-a)*(hp-b)*(hp-c));
                    System.out.println("Area of a triangle is: " + s);
                    key = true;
                } else {
                    System.out.println("Incorrect lengths entered, try again.");
                }
            } else {
                System.out.println("Incorrect input, try again");
            }
        }
    }
}
