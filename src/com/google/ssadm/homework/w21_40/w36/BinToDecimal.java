package com.google.ssadm.homework.w21_40.w36;

// Enter the number in binary format from the console. Translate it to
// decimal and display (“10” -> 2).

import java.util.Scanner;

public class BinToDecimal {
    public static void main(String[] args) {
        System.out.println("Please enter number in binary format (e.g. 0101 ) 1-8 digits:");
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        if(num.matches("^[01]+$")){
            System.out.println(Integer.parseInt(num, 2));
            System.out.println(parseInt(num));
        } else {
            System.out.println("Invalid input");
        }
    }

    private static int parseInt(String num) {
        int tmp = 0;
        StringBuilder sb = new StringBuilder(num);
        char[] myArray = sb.reverse().toString().toCharArray();
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] == '1'){
                tmp = tmp + (int) Math.pow(2, i);
            }
        }
        return tmp;
    }
}
