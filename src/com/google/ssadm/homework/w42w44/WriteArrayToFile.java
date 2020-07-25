package com.google.ssadm.homework.w42w44;

// Write a method to save a two-dimensional array of integers to a text file.

import java.io.FileWriter;
import java.io.IOException;

public class WriteArrayToFile {
    final static int[][] myArray = {
            {0, 1, 2},
            {3, 4, 5},
            {6, 7, 8}
    };
    final static String fileName = "array.txt";

    public static void main(String[] args) {
        if(writeArrayToFile(myArray, fileName)) {
            System.out.printf("Array is written to file %s. Bue.." , fileName);
        } else {
            System.out.println("Something went wrong... ");
        }
    }

    private static boolean writeArrayToFile(int[][] myArray , String fileName) {
        boolean result = false;
        try (FileWriter fw = new FileWriter(fileName)){
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            for(int i = 0; i < myArray.length; i++){
                sb.append("{");
                for(int j = 0; j < myArray[i].length; j++){
                    sb.append(myArray[i][j]).append(!(j == myArray[i].length-1) ? ", " : "");
                }
                sb.append(!(i == myArray.length-1) ? "}," : "}}").append("\n");
            }
            fw.write(sb.toString());
            result = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
