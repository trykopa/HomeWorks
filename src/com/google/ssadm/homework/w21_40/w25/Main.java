package com.google.ssadm.homework.w21_40.w25;

//Ввести с клавиатуры число (до миллиарда)
// которое обозначает количество долларов и
// центов пользователя. Вывести это количество прописью.
// Например:
// How much money do you have?
// 123,34
// You have: one hundred twenty three dollars thirty four cents

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    private static final String[] numbers = {
            "", "one", "two", "three", "four", "five", "six", "seven", " eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] tens = {
            "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    private static final String zero = "zero";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much money do you have? (eg 123,23, 999999999,99 is a max) ");
        String input = sc.nextLine();
        //9 digits coma or dot and two digits
        final Pattern pattern = Pattern.compile("^(\\d{1,9}+)([,.]\\d{2})$"); //any
        if (!pattern.matcher(input).matches()) {
            System.out.println("Incorrect input");
        } else {
            System.out.println(input);
            String[] split = input.split("[.,]+");
            String result = ((Integer.parseInt(split[0]) == 0) ? zero : convert(split[0])) + " dollars and " +
                    ((Integer.parseInt(split[1]) == 0) ? zero : convert(split[1])) + " cents";
            System.out.println("You have: " + result);
        }
    }

    private static String convert(String toConvert) {
        String result;
        int digit = Integer.parseInt(toConvert);

        if (digit < 20) {
            result = numbers[digit];
        } else if (digit < 100) {
            result = tens[digit / 10] + ((digit % 10 != 0) ? " " : "") + numbers[digit % 10];
        } else if (digit < 1000) {
            result = numbers[digit / 100] + " hundred" + ((digit % 100 != 0) ? " " : "") +
                    convert(String.valueOf(digit % 100));
        } else if (digit < 1000000) {
            result = convert(String.valueOf(digit / 1000)) + " thousand" + ((digit % 1000 != 0) ? " " : "") +
                    convert(String.valueOf(digit % 1000));
        } else {
            result = convert(String.valueOf(digit / 1000000)) + " million" + ((digit % 1000000 != 0) ? " " : "") +
                    convert(String.valueOf(digit % 1000000));
        }

        return result;
    }
}
