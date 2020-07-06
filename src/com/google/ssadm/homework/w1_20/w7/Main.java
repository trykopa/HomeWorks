package com.google.ssadm.homework.w1_20.w7;

// Треугольник существует только тогда, когда сумма любых двух его сторон
// больше третьей. Дано: a, b, c – стороны предполагаемого треугольника.
// Напишите программу которая укажет существует такой треугольник или нет.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c;
        System.out.println("Введите последовательно длины трех сторон треугольника (положительные числа): ");
        a = getSide();
        b = getSide();
        c = getSide();
        if (((a+b)>c)&((a+c)>b)&((b+c)>a)){
                System.out.printf("Треугольник со сторонами %f %f %f существует", a, b, c);
            } else {
                System.out.printf("Треугольник со сторонами %f %f %f не существует", a, b, c);
            }
        }

    public static double getSide(){
        System.out.println("Введите длину стороны: ");
        Scanner sc = new Scanner(System.in);
        while(true) {
            if (sc.hasNextDouble()) {
                double side = sc.nextDouble();
                if (side > 0) {
                    return side;
                } else {
                    System.out.println("Вы ввели неверные данные попытайтесь еще раз.1");
                    sc.next();
                }
            } else {
                System.out.println("Вы ввели неверные данные попытайтесь еще раз.2");
                sc.next();
            }
        }
    }
}




