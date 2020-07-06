package com.google.ssadm.homework.w1_20.w13;

// Вычислить с помощью цикла факториал числа - n введенного с клавиатуры (4<n<16).
// Факториал числа это произведение всех чисел от этого числа до 1.
// Например 5!=5*4*3*2*1=120

import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.IntStream;
//Java 14 case stile
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number from 0 and above to find factorial");
        int number = sc.nextInt();
        switch (number) {
            case 0 -> System.out.println("Factorial 0 is 1");
            case 1 -> System.out.println("Factorial 1 is 1");
            case 2 -> System.out.println("Factorial 2 is 2");
            default -> {
                System.out.printf("Factorial %d is %d", number, factorial(number));
            }
        }
    }

    public static BigInteger factorial(int i){
        return IntStream
                .rangeClosed(2, i) // stream of int from 2 to i
                .mapToObj(BigInteger::valueOf) // stream of BigInteger objects
                .reduce(BigInteger::multiply) // multiply all BigInteger
                .get();
    }
}
