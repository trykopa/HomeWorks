package com.google.ssadm.homework.w22;

// Введите строку текста с клавиатуры — реализуйте программу для
// возможности подсчета количества символа — 'b' в этой строке, с выводом результат на экран.

import java.util.Scanner;

public class Main {
    final static char b = 'b'; //char to find in string

    public static void main(String[] args) {
        System.out.println("Please enter you string: ");
        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine();

        //first
        int count = 0;
        for (char c : myString.toLowerCase().toCharArray()){
            if(c==b){
                count++;
            }
        }
        System.out.println(count);

        //second
        System.out.println(myString.toLowerCase().chars().filter(ch -> ch == b).count());


    }
}
