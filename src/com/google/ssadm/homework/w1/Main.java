package com.google.ssadm.homework.w1;

//   1) Написать программу которая считывает 5-и значное число с клавиатуры и выводит цифры из которого оно состоит.
//      Например : Считывается число 54698 Выводиться:
//      5 4 6 9 8

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter 5-digit number or any letter to exit");
        boolean key = false; //key to exit from program
        Scanner sc = new Scanner(System.in);
        while (!key){
            if(sc.hasNextInt()){
                int number = sc.nextInt();
                if((number/10000)>=1){
                    if((number/10000)>9){
                        System.out.println("Entered number too long, try again");
                    } else {
                        System.out.println("First digit is: " + (number/10000));
                        System.out.println("Second digit is: " + (number/1000)%10);
                        System.out.println("Third digit is: " + (number/100)%10);
                        System.out.println("Fourth digit is: " + (number/10)%10);
                        System.out.println("Fifth digit is: " + number%10);
                        key = true;
                    }
                } else {
                    System.out.println("Entered number too short, try again.");
                }
            } else {
                System.out.println("You enter not a number, the program is closed.");
                key = true;
            }
        }
        sc.close();
    }
}
