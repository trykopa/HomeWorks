package com.google.ssadm.homework.w1_20.w6;

// Определить количество дней в году, который вводит пользователь.
// В високосном годе - 366 дней, тогда как в обычном 365.
// Високосными годами являются все года делящиеся нацело на 4
// за исключением столетий, которые не делятся нацело на 400.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите номер года для вычисления количества дней в году (целое положительное число): ");
        Scanner sc = new Scanner(System.in);
        try{
            int year = sc.nextInt();
            if(year%400!=0){
                if(year%100!=0) {
                    if(year%4!=0){
                        System.out.printf("Год %d - невисокосный. %n", year);
                    } else {
                        System.out.printf("Год %d - високосный. %n", year);
                    }
                } else {
                    System.out.printf("Год %d - невисокосный. %n", year);
                }
            } else {
                System.out.printf("Год %d - високосный. %n", year);
            }
        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод, номер года должен быть положительным целым числом." +
                    "Повторите ввод");
        }
    }
}
