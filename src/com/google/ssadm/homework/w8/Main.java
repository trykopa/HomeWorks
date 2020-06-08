package com.google.ssadm.homework.w8;

// Есть круг с центром в начале координат и радиусом 4. Пользователь вводит с клавиатуры
// координаты точки x и y. Написать программу которая определит лежит ли эта точка
// внутри круга или нет.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double radius = 4d;
        double x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter x ");
        x = sc.nextDouble();
        System.out.println("Please enter y ");
        y = sc.nextDouble();
        double length = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        if(length<radius){
            System.out.printf("The point with coordinates %f %f lies inside the circle with radius %f%n", x, y, radius);
        } else {
            System.out.printf("The point with coordinates %f %f lies outside the circle with radius %f%n", x, y, radius);
        }
    }
}
