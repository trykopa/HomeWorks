package com.google.ssadm.homework.w1_20.w5;
// Есть девятиэтажный дом, в котором 4 подъезда. Номер подъезда начинается с единицы.
// На одном этаже 4 квартиры. Напишите программу которая получит номер квартиры
// с клавиатуры, и выведет на экран на каком этаже, какого подъезда расположенна эта
// квартира. Если такой квартиры нет в этом доме то нужно сообщить об этом пользователю.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите номер квартиры(1-144): ");
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                int app = sc.nextInt();
                if(app>0&app<145) {
                    System.out.printf("Квартира  - %d, находится в %d подъезде на %d этаже",
                            app,((app-1)/36+1), 9-((((app-1)/36+1)*36)-app)/4);
                    break;
                } else {throw new InputMismatchException("Error input");}
            } catch (InputMismatchException e) {
                System.out.println("Неверный ввод, номер квартиры должен быть положительным целым числом " +
                        "от 1 до 144. Повторите ввод");
            }
        }
    }
}
