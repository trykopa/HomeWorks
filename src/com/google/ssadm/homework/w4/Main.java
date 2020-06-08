package com.google.ssadm.homework.w4;

//Написать программу которая считает 4 числа c клавиатуры и выведет на экран самое большое из них.

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        SortedSet<Double> mySet = new TreeSet<>();
        System.out.println("Введите 4 числа последовательно.");
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= 4; i++){
            System.out.printf("%d - число: %n", i);
            if(sc.hasNextDouble()) {
                mySet.add(sc.nextDouble());
            } else {
                System.out.println("Неверный ввод попытайтесь еще раз");
                i--;
                sc.next();
            }
        }
        System.out.printf("наибольшее из ввведенных чисел - %f %n", mySet.last());
        System.out.println(mySet.toString());
    }
}
