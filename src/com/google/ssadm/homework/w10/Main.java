package com.google.ssadm.homework.w10;

// Проверить, является ли четырехзначное число счастливым билетом.
// Дано четырехзначное число. Проверить, является ли оно «счастливым билетом».
// Примечание: счастливым билетом называется число, в котором - при четном
// количестве цифр в числе сумма цифр его левой половины равна сумме цифр его
// правой половины. Например, рассмотрим число 1322. Его левая половина равна 13,
// а правая – 22, и оно является счастливым билетом (т. к. 1 + 3 = 2 + 2)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter 4-digit  number:");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (str.matches("\\d{4}")){
            char[] myCharArray = str.toCharArray();
            if((Character.getNumericValue(myCharArray[0])+Character.getNumericValue(myCharArray[1]))==
                    Character.getNumericValue(myCharArray[2])+Character.getNumericValue(myCharArray[3])){
                System.out.println("This is a happy ticket");
            } else {
                System.out.println("This is not a happy ticket");
            }
        } else {
            System.out.println("Incorrect input");
        };
    }
}
