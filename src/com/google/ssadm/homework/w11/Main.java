package com.google.ssadm.homework.w11;

// С клавиатуры вводиться шестизначное число.
// Проверить, является ли оно палиндромом. Примечание: палиндромом называется число,
// слово или текст, которые одинакового читаются слева направо и справа налево.
// Например, это числа 143341, 5555, 7117 и т. д.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter 6-digit  number:");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (str.matches("\\d{6}")) {
            if(str.equals(new StringBuilder(str).reverse().toString())){
                System.out.printf("%s is palindrome %n", str);
            } else {
                System.out.printf("%s is not a palindrome %n", str);
            }
        } else {
            System.out.println("Incorrect input");
        }
    }
}
