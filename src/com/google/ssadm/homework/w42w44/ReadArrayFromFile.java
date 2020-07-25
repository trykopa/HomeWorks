package com.google.ssadm.homework.w42w44;

// Напишите метод для считывания двухмерного массива из файла
// (размер массива заранее неизвестен, определите его сами на основе данных в файле).

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReadArrayFromFile {
    final static String fileName = "array.txt";

    public static void main(String[] args) {

        int[][] array = readArrayFromFile(fileName);
        if (array != null) {
            printTwoDimensionalArray(array);
        }
    }

    private static int[][] readArrayFromFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            List<String> draft = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                draft.add(line);
            }
            int[][] result = new int[draft.size()][draft.get(0).split(",").length];
            for(int i = 0; i < draft.size(); i++){
                String tmp = draft.get(i).replaceAll("[{}\\s+]", "");
                String[] tmpArray = tmp.split(",");
                result[i]  = Arrays.stream(tmpArray)
                        .mapToInt(Integer::parseInt)
                        .toArray();
            }
            return result;
        } catch (IOException e) {
            System.out.println("Error, Panic, Alarm!!! ");
            return null;
        }
    }

    private static void printTwoDimensionalArray(int[][] array){
        System.out.print("{");
        for(int i = 0; i < array.length; i++){
            System.out.print(streamArrayToString(array[i]));
            System.out.println(!(i == array[i].length-1) ? "," : "}");
        }
    }
    private static String streamArrayToString(int[] array) {
        return Arrays.stream(array).mapToObj(String::valueOf)
                .collect(Collectors.joining(", ", "{", "}"));
    }
}
