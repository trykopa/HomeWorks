package com.google.ssadm.homework.w46;

// Write a method to create an ASCII art file,
// that is, figures of 40x40 characters filled with symbols forming a pattern.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import static java.lang.Math.max;

public class AsciiArt {
    final static String file = "src/com/google/ssadm/homework/w46/ascii.txt";
    final static int xNum = 40;
    final static int yNum = 40;
    final static char center = '@';

    public static void main(String[] args) {
        File workFile = new File(file);
        try(PrintWriter pw = new PrintWriter(workFile)){
            for (int i = 0; i < xNum; i++){
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < yNum; j++){
                    sb.append((char) (center - max(Math.abs(xNum/2-i), Math.abs(yNum/2-j))));
                }
                pw.println(sb.toString());
            }
            System.out.println("Ascii file is ready");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
