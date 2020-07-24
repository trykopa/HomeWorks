package com.google.ssadm.homework.w21_40.w37;

// Display 10 lines with the value of Pi. Moreover, in the first
// the line should have 2 decimal places, in the second 3, in the third 4, etc.

import java.util.Formatter;
import java.util.stream.IntStream;

public class PrintPi {
    public static void main(String[] args) {
        IntStream.range(0, 10).forEach(PrintPi::printPi);
    }

    private static void printPi(int i) {
        Formatter formatter = new Formatter();
        formatter.format(("%." + (i+2) + "f"), Math.PI);
        System.out.println(formatter.toString());
    }
}
