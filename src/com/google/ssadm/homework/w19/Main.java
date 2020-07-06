package com.google.ssadm.homework.w19;
//Дан массив {0,5,2,4,7,1,3,19} — написать программу для подсчета нечетных цифр в нем.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {0,5,2,4,7,1,3,19};

        //first
        int count = 0;
        for(int i = 0; i <= myArray.length-1; i++){
            if (myArray[i]%2!=0){
                count++;
            }
        }
        System.out.println(count);

        //second
        System.out.println((int) Arrays.stream(myArray).filter(i -> i % 2 != 0).count());

    }
}
