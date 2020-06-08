package com.google.ssadm.homework.w9;

//Дан треугольник координаты вершин А(0,0), В(4,4), С(6,1).
// Пользователь вводит с клавиатуры координаты точки x и y.
// Написать программу которая определит лежит ли эта точка внутри треугольника или нет.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int
                xa = 0, ya = 0,
                xb = 4, yb = 4,
                xc = 6,yc = 1;

        double x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter x ");
        x = sc.nextDouble();
        System.out.println("Please enter y ");
        y = sc.nextDouble();
        double a = (xa-x)*(yb-ya)-(xb-xa)*(ya-y);
        double b = (xb-x)*(yc-yb)-(xc-xb)*(yb-y);
        double c = (xc-x)*(ya-yc)-(xa-xc)*(yc-y);
        if ((a >= 0 && b >= 0 && c >= 0) || (a <= 0 && b <= 0 && c <= 0)) {
            System.out.printf("The point with coordinates %f %f lies inside the triangle.%n", x, y);
        } else {
            System.out.printf("The point with coordinates %f %f lies inside the triangle.%n", x, y);
        }

    }
}
