package com.google.ssadm.homework.w20;

// Написать код для возможности создания массива целых чисел
// (размер вводиться с клавиатуры) и возможности заполнения
// каждого его элемента вручную. Выведите этот массив на экран.

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter array size:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        //first
        int[] myArray = new int[size];
        if(size>0){
            for(int i =0; i < myArray.length; i++){
                System.out.printf("Please enter %d element of myArray: %n", i);
                myArray[i] = sc.nextInt();
            }
            System.out.println(Arrays.toString(myArray));;
        } else {
            System.out.println("Incorrect input");
        }

        //second
        int[] myArrayNew = new int[size];
        IntStream.range(0, myArrayNew.length)
                .forEach(i -> {
                    System.out.printf("Please enter %d element of myArray: %n", i);
                    myArrayNew[i] = sc.nextInt();
                });

        Arrays.stream(myArrayNew).forEach(i ->{
            System.out.print(i + "\t");
        });

    }
}
